# Quarkus getting-started

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Use the app
Using the following command 
```
./mvnw compile quarkus:dev 
```
you will run the app in dev mode in the port 8080 of your localhost.
You can also run the app by executing the jar file: Run this command first 
```
./mvnw package 
```
to get the target file and then this one 
```
java -jar target/quarkus-app/quarkus-run.jar 
```
to execute the app.

## Endpoints
http://localhost:8080/hello will return a simple "hello"
http://localhost:8080/hello/greeting/{name}/{language} will return a greeting based on the name and the language you chose (en for english, es for español).
If you chose en and your name is Victor you will recieve a "hello Victor"
If you chose es and your name is also Victor you will recieve a "hola Victor".
