# Video Hosting Platform

A backend video hosting platform built using **Spring Boot, PostgreSQL, MinIO, RabbitMQ, JWT, and FFmpeg**.

## GitHub Repository

https://github.com/kaushikpaul-dev/video-hosting-platform.git

## Tech Stack

* Java
* Spring Boot
* Spring Security + JWT
* PostgreSQL
* MinIO
* RabbitMQ
* FFmpeg
* Swagger / OpenAPI
* Maven

## Features

* User registration and login
* JWT authentication
* Video upload
* Chunked video upload
* Video storage using MinIO
* Video metadata using PostgreSQL
* RabbitMQ-based transcoding
* FFmpeg video processing
* Video status tracking
* Video streaming
* Swagger API documentation

## Architecture

```text
Client
  |
  v
Spring Boot REST API
  |
  +---- PostgreSQL  -> User & Video metadata
  |
  +---- MinIO       -> Video storage
  |
  +---- RabbitMQ    -> Transcoding messages
                       |
                       v
                     FFmpeg
```
## Design Decisions

- **Spring Boot** – Used to build REST APIs and backend services.
- **JWT** – Used for stateless authentication and authorization.
- **PostgreSQL** – Used to store users and video metadata.
- **MinIO** – Used to store original and transcode video files.
- **RabbitMQ** – Used for asynchronous video transcoding.
- **FFmpeg** – Used to transcode uploaded videos.
- **Chunked Upload** – Used to support reliable upload of larger video files.
- **Swagger/OpenAPI** – Used to document and test the APIs.

## Setup

### 1. Clone the project

```bash
git clone https://github.com/kaushikpaul-dev/video-hosting-platform.git
cd video-hosting-platform
```

### 2. Start required services

Make sure these are running:

* PostgreSQL
* MinIO
* RabbitMQ

### 3. Configure `application.properties`

```properties
spring.application.name=video-hosting-platform
server.port=8080

# PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/video_hosting_db
spring.datasource.username=postgres
spring.datasource.password=YOUR_POSTGRES_PASSWORD

# JPA
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.open-in-view=false

# MinIO
minio.url=http://localhost:9000
minio.access-key=minioadmin
minio.secret-key=minioadmin
minio.bucket=videos

# File Upload
spring.servlet.multipart.enabled=true
spring.servlet.multipart.max-file-size=2GB
spring.servlet.multipart.max-request-size=2GB

# RabbitMQ
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest

# Logging
logging.level.org.springframework.security=DEBUG
```

### 4. Run the application

```bash
mvn spring-boot:run
```

Application:

```text
http://localhost:8080
```

## Swagger

```text
http://localhost:8080/swagger-ui/index.html
```

## Main APIs

```text
POST /api/auth/register
POST /api/auth/login

POST /api/videos/upload
GET  /api/videos
GET  /api/videos/{videoId}/status

POST /api/video-upload/init
POST /api/video-upload/{uploadId}/chunk
POST /api/video-upload/{uploadId}/complete
```

## Video Upload Flow

```text
Upload Video
     |
     v
Store in MinIO
     |
     v
Save metadata in PostgreSQL
     |
     v
Send message to RabbitMQ
     |
     v
FFmpeg Transcoding
     |
     v
Store transcoded video in MinIO
     |
     v
Update video status
```

## Author

**Kaushik Paul**
