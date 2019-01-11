<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Calculator</title>
</head>
<body>
<h1 style="text-align: center">Calculator</h1>
<form method="post" action="calc">
    <label for="first">First number</label>
    <input type="text" name="first" id="first"/>
    <br/>
    <label for="second">Second number</label>
    <input type="text" name="second" id="second"/>
    <br/>
    <div>
        <label for="add">addition</label>
        <input type="radio" name="add" value="add" id="add"/>
        <br/>

        <label for="sub">subtraction</label>
        <input type="radio" name="sub" value="sub" id="sub"/>
        <br/>

        <label for="mul">multiplication</label>
        <input type="radio" name="mul" value="mul" id="mul"/>
        <br/>

        <label for="div">division</label>
        <input type="radio" name="div" value="div" id="div"/>
        <br/>
    </div>
    <input type="submit"/>
</form>
</body>
</html>
