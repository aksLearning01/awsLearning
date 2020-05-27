# Hello World Rest APIs running on port 5000

Run edu.aks.docker.SpringBootWithDockerApplication as a Java Application.


## Containerization

### Troubleshooting

- Problem - Caused by: com.spotify.docker.client.shaded.javax.ws.rs.ProcessingException: java.io.IOException: No such file or directory
- Solution - Check if docker is up and running!
- Problem - Error creating the Docker image on MacOS - java.io.IOException: Cannot run program “docker-credential-osxkeychain”: error=2, No such file or directory
- Solution - https://medium.com/@dakshika/error-creating-the-docker-image-on-macos-wso2-enterprise-integrator-tooling-dfb5b537b44e

### Creating Containers


- mvn package
- docker run akslearning01/spring-boot-with-docker:0.0.1-SNAPSHOT
- docker run -p 5000:5000 akslearning01/spring-boot-with-docker:0.0.1-SNAPSHOT
- docker run -p 5000:5000 akslearning01/spring-boot-with-docker:0.0.1-SNAPSHOT

To test execute API at http://localhost:5000/hello-world

```
docker login  --username <username> --password <password>
```


## Hello World URLS

- http://localhost:5000/hello-world

```txt
Hello World
```

- http://localhost:5000/hello-world-bean

```json
{"message":"Hello World - Changed"}
```

- http://localhost:5000/hello-world/path-variable/aksLearning

```json
{"message":"Hello World, aksLearning"}
```
