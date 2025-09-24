package com.halqaty.student_service;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.testcontainers.containers.PostgreSQLContainer;

@Import(TestcontainersConfiguration.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class StudentServiceImplApplicationTests {

    @ServiceConnection //Springboot will automatically inject the uri using the app's config settings
    static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:latest");

    @LocalServerPort
    private Integer port;

    @BeforeEach
    void setup() {
        RestAssured.baseURI = "http://localhost";
        RestAssured.port = port;
    }

    static {
        postgreSQLContainer.start();
    }

    @Test
    void createProduct() {

        String requestBody = """
                {
                  "firstName": "Hisham",
                  "lastName": "Alsuhaibani",
                  "email": "hisham.works@outlook.com"
                }
                """;
//                body("userId", Matchers.notNullValue());
        RestAssured.given().contentType(ContentType.JSON).body(requestBody).post("/students").then().contentType(ContentType.JSON).statusCode(HttpStatus.SC_CREATED).body("id", Matchers.notNullValue()).
                body("firstName", Matchers.notNullValue());
    }

}
