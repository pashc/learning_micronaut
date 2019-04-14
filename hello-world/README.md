# Micronaut basics and Hello World example

## Scaffolding

Micronaut comes with a convenient CLI scaffolding tool. It can be used as CLI tool 

```
mn help
mn help create-app

```
or in interactive mode.

```
$ mn
| Starting interactive mode...
| Enter a command name to run. Use TAB for completion:
mn> help
...
mn> help create-app
...
```

### creating a new project
As a polyglot framework Micronaut supports Java, Groovy and Kotlin as first-class citizens. 
For projects builds it supports gradle and maven. Using the CLI tool we can easily setup a new projects.
```
mn create-app --lang kotlin --build gradle hello-world
```
As default the server listen on a random port but can be configured in the *src/main/resources/application.yml* by adding the following 
config:
```
micronaut:
    server:
        port: 8080
```
The application is ready to run:
```
cd mn-hello-world
./gradlew run
> Task :run
13:02:14.933 [main] INFO  io.micronaut.runtime.Micronaut - Startup completed in 809ms. Server Running: http://localhost:8080
<===========--> 85% EXECUTING [1m 8s]
```
Calling the API should gives us a response from the running application on the server.
```
url http://localhost:8080
{"_links":{"self":{"href":"/","templated":false}},"message":"Page Not Found"}
```
####creating components
The CLI tool can also be used to create components like controllers and clients along with their test classes. 
```
mn create-controller HelloControler
| Rendered template Controller.kt to destination src/main/kotlin/hello/world/HelloController.kt
| Rendered template ControllerTest.kt to destination src/test/kotlin/hello/world/HelloControllerTest.kt
```
Following Test-Driven Development it auto generates a test for the new controller as well.

To create a client the following CLI command can be used:
``` 
mn create-client HelloClient
| Rendered template Client.kt to destination src/main/kotlin/hello/world/HelloClient.kt
```

## References
[codecentric Blog](https://blog.codecentric.de/en/2019/01/micronaut-microservices/)
