
//build image
docker build -f Dockerfile -t docker-spring-boot .
//run docker
docker run -p 8085:8085 docker-spring-boot
