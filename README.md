Calculator Servlet Example
===

This is just a sample servlet-based Calculator example.

Installing Tomcat 9.x
===

[Download it](https://downloads.apache.org/tomcat/tomcat-9/v9.0.38/bin/apache-tomcat-9.0.38.zip)
and extract it to `~/apache-tomcat-9.0.38/`.


Build & deploy
===

    mvn clean install && cp target/mycalcwebapp.war ~/apache-tomcat-9.0.38/webapps/
    
Accessing the app
===

Open up <http://localhost:8080/mycalcwebapp/>
