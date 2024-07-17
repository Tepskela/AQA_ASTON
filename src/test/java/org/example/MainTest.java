package org.example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "https://postman-echo.com";
    }
    @Test
    public void testGet() {

        given()
                .when()
                .get("/get?foo1=bar1&foo2=bar2")
                .then()
                .log().all()
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));
    }
    @Test
    public void testPostFormData() {
        given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .log().all()
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }
    @Test
    public void testRawText() {

        given()
                .body("")
                .when()
                .post("/post")
                .then()
                .log().all()
                .body("json", equalTo(null));
    }

    @Test
    public void testPut() {
        String dataToSend = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(dataToSend)
                .when()
                .put("/put")
                .then()
                .statusCode(200)
                .body("args", equalTo(new HashMap<>()))
                .body("data", equalTo(dataToSend))
                .body("files", equalTo(new HashMap<>()))
                .body("form", equalTo(new HashMap<>()));
    }
    @Test
    public void testPatch() {
        String dataToSend = "This is expected to be sent back as part of response body.";

        given()
                .contentType(ContentType.TEXT)
                .body(dataToSend)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .body("args", equalTo(new HashMap<>()))
                .body("data", equalTo(dataToSend))
                .body("files", equalTo(new HashMap<>()))
                .body("form", equalTo(new HashMap<>()));
    }
    @Test
    public void testDelete() {
        given()
                .when()
                .delete("/delete")
                .then()
                .log().all()
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/delete"));
    }

}