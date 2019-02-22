package com.example.Convertor;

import com.example.Convertor.model.Order;
import com.example.Convertor.service.CurrencyService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConvertorApplication.class)
@WebAppConfiguration
public class ConvertorApplicationTests extends AbstractTest{

	@Override
	@Before
	public void setUp() {
		super.setUp();
	}

	@Test
	public void integrationTest() throws Exception {
		Order order = new Order(100.0, "USD", "EUR");
		String inputJson = super.mapToJson(order);
		MvcResult mvcResult = mvc.perform(post("/convertor")
				.contentType(MediaType.APPLICATION_JSON_VALUE)
				.content(inputJson)).andReturn();
		String res = mvcResult.getResponse().getContentAsString();
		assert(Double.valueOf(res) == 90);

	}

	@Test
	public void convertToPLN(){
		Order order = new Order(100.0, "USD", "PLN");
		double res = CurrencyService.convert(order);
		assert(res == 380);
	}

}
