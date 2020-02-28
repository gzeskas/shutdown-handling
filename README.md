Build: `./gradlew clean build && docker build -t shutdown .`

Run `docker run shutdown:latest`

Try to kill running container with CTRL+C to send shutdown signal and application should print message: `Received shutdown signal` 