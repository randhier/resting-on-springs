package com.spring.resting;

import junit.framework.TestCase;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GreetingTestIT extends TestCase {

    public void testGreetingDefault(){
        get("/greetings").then().statusCode(200).body("content", equalTo("Hello, World!"));
    }

    public void testGreetingCustom(){
        get("/greetings?name=Randhier").then().statusCode(200).body("content", equalTo("Hello, Randhier!"));
    }
}
