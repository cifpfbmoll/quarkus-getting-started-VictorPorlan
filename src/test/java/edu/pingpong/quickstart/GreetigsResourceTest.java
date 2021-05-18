package edu.pingpong.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetigsResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }
    @Test
    public void testHelloNameEnEndpoint(){
        given()
                .pathParam("name","victor")
                .pathParam("idioma","en")
                .when().get("/hello/greeting/{name}/{idioma}")
                .then().statusCode(200).body(is("hello victor"));
    }
    @Test
    public void testHelloNameEsEndpoint(){
        given()
                .pathParam("name","victor")
                .pathParam("idioma","es")
                .when().get("/hello/greeting/{name}/{idioma}")
                .then().statusCode(200).body(is("hola victor"));
    }
    @Test
    public void testHelloNameInvalidLanEndpoint(){
        given()
                .pathParam("name","victor")
                .pathParam("idioma","pinga")
                .when().get("/hello/greeting/{name}/{idioma}")
                .then().statusCode(200).body(is("idioma invalido"));
    }

}