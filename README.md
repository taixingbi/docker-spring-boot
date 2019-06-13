### build image
docker build  -t taixingbi/docker-spring-boot .

### run docker
docker run -p 8081:8081 docker-spring-boot
