
//build image
docker build -f Dockerfile -t taixingbi/spring-boot-test .
//run docker
docker run -p 8081:8081 docker-spring-boot
