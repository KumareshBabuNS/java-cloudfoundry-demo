package io.pcfsolutions;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by benwilcock on 11/10/2016.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloWorldControllerTests {

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    HelloWorldController controller;

    @Test
    public void integrationTestSayHello(){
        ResponseEntity<String> response = this.restTemplate.getForEntity("/", String.class);
        Assert.assertEquals(HttpStatus.OK.value(), response.getStatusCode().value());
        Assert.assertTrue(response.hasBody());
        Assert.assertEquals(response.getBody(), "Hello!");
    }

    @Test
    public void testHelloDirectly(){
        Assert.assertEquals(controller.sayHello(), "Hello!");
    }
}
