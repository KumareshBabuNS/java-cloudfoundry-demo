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

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JavacarsIntegrationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
    public void testCreateManufacturer(){
        ResponseEntity<ManufacturerEntity> response = testRestTemplate.postForEntity("/manufacturers", new ManufacturerEntity("SKODA"), ManufacturerEntity.class);
        Assert.assertEquals(response.getStatusCode(), HttpStatus.CREATED);
        Assert.assertTrue(response.hasBody());
        Assert.assertEquals(response.getBody().getName(), "SKODA");
    }
}
