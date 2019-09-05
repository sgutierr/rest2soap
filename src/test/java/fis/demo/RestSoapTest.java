package fis.demo;


import org.apache.camel.Produce;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.spring.CamelSpringTestSupport;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;
import java.util.HashMap;

public class RestSoapTest extends CamelSpringTestSupport {

	@Test
	public void testPositiveSetSessionSucceeds() throws Exception
	{
		//prepare headers
		Map<String, Object> headers = new HashMap<>();
		headers.put("Content-Type", "application/json");

		//send the request
		String response = template.requestBodyAndHeaders(
			"netty4-http:http://localhost:10000/say/hello",
			"{\"name\":\"Alexander\",\"nickname\":\"The Great\"}", 
			headers,
			String.class);

		System.out.println("JUNIT response: "+response);
		
		//assertions
		assertEquals("response not expected: "+response, response, "{\"message\":\"Hello Alexander The Great\",\"status\":\"ok\"}");

		// Validate our expectations
		assertMockEndpointsSatisfied();
	}


	@Override
	protected ClassPathXmlApplicationContext createApplicationContext() {
		return new ClassPathXmlApplicationContext("spring/camel-context.xml");
	}

}
