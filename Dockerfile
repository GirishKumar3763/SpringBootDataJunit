From openjdk:8
copy ./target/SpringBootSpringData-1.0.jar SpringBootSpringData-1.0.jar
CMD ["java","-jar","SpringBootSpringData-1.0.jar"]

