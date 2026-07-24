# 1. Configuration

## 1.1. Dockerfile

- docker build -t java_docker_starter_container:latest .
- docker run --name java_docker_starter_container -p 5005:5005 java_docker_starter_container:latest
  ![Dockerfile](images/docker-config.png)

## 1.2. Docker compose

- docker compose up -d
  ![docker-compose.yml](images/docker-compose-config.png)

## 1.3. Remote Debug

![Dockerfile](images/remote-config.png)
