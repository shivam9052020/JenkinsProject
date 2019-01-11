Calculator Servlet Example
===

This is just a sample servlet-based Calculator example.

Installing Tomcat 8.x
===

[Download it](http://mirror.nohup.it/apache/tomcat/tomcat-8/v8.5.37/bin/apache-tomcat-8.5.37.zip)
and extract it to `~/apache-tomcat-8.5.37/`.


Build & deploy
===

    mvn clean install && cp target/mycalcwebapp.war ~/apache-tomcat-8.5.37/webapps/
    
Accessing the app
===

Open up <http://localhost:8080/mycalcwebapp/>
