package com.levelup;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringsresttemplateApplicationTests {

	@Test
	public void test() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
				"https://data.sparkfun.com/streams/dZ4EVmE8yGCRGx5XRX1W.json",
				String.class);

		System.out.println(response);
	}

}
