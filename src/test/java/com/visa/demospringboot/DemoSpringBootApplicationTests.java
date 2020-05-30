package com.visa.demospringboot;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.visa.demospringboot.entity.CustomDimensionRequest;
import com.visa.demospringboot.repository.CustomDimensionRequestDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;
import java.util.UUID;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoSpringBootApplicationTests {

	@Autowired
	CustomDimensionRequestDao cdrDao;

	@Test
	public void contextLoads() throws JsonProcessingException {

		for (int i = 0; i < 100; i++) {
			 CustomDimensionRequest customDimensionRequest = new CustomDimensionRequest();

			 customDimensionRequest.setId(i + 1l);

			 customDimensionRequest.setName(UUID.randomUUID().toString());

			 customDimensionRequest.setType("selfServiceCustomDimension");

			 if(i % 2 == 0) {

				 customDimensionRequest.setPartner("Oracle");
			 } else {
			 	customDimensionRequest.setPartner("DLX");
			 }
			 String content = "subDba: ";
			for (int j = 0; j < 5; j++) {
				 content +=  "merchant" + (char)('A' + new Random().nextInt(26));
				if(j != 4) {
					content += ", ";
				}
			}
			customDimensionRequest.setContent(content);

			ObjectMapper objectMapper = new ObjectMapper();

			String jsonStr = objectMapper.writeValueAsString(customDimensionRequest);


			customDimensionRequest.setContent(jsonStr);

			cdrDao.saveAndFlush(customDimensionRequest);

		}

		List<CustomDimensionRequest> list = cdrDao.findAll();
		for (CustomDimensionRequest customDimensionRequest : list) {
			System.out.println(customDimensionRequest);
		}
	}

}
