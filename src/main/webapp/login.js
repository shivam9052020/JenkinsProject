const apiUrl = 'http://localhost:8080/mycalcwebapp';

function login(username, password) {
    let credentials = 'Basic ' + btoa(username + ':' + password);

    fetch(apiUrl + '/login', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
            'Authorization': credentials
        }
    })
    .then(res => {
       if (res.ok) {
         res.json().then(json => {
            document.cookie = 'csrfToken=' + json.token + ';SameSite=strict';
            window.location.replace('index.html');
         });
       }
    })
    .catch(error => console.error('Error logging in: ', error));
}

window.addEventListener('load', function(e) {
    document.getElementById('login')
        .addEventListener('submit', processLoginSubmit);
});

function processLoginSubmit(e) {
    e.preventDefault();

    let username = document.getElementById('username').value;
    let password = document.getElementById('password').value;

    login(username, password);
    return false;
}