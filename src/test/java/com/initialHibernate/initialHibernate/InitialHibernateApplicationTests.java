package com.initialHibernate.initialHibernate;



import com.initialHibernate.initialHibernate.controller.EmployeeController;
import com.initialHibernate.initialHibernate.facade.EmployeeFacadeImp;
import com.initialHibernate.initialHibernate.service.EmployeeServiceImp;
import org.hibernate.mapping.Array;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = InitialHibernateApplication.class)
@ActiveProfiles("integration")
class InitialHibernateApplicationTests {
	int port = 8080;
	String baseUrl = "http://localhost:";
	@Autowired private TestRestTemplate restTemplate;
	@Autowired private EmployeeController employeeController;
	@Autowired private EmployeeFacadeImp employeeFacadeImp;
	@Autowired private EmployeeServiceImp employeeServiceImp;

	@Test
	void getAllNamesTest() {
//		ResponseEntity<LinkedHashMap<String,Object>> responseEntity = this.restTemplate.exchange(baseUrl + port + "/getAllNames",
//				HttpMethod.GET, null, new ParameterizedTypeReference<>() {
//				});
//
//		LinkedHashMap<String,Object> responseData = responseEntity.getBody();
//		int responseLength = 0;
//		if(responseData.containsKey("data")) {
//			ArrayList<?> data = (ArrayList<?>) responseData.get("data");
//			responseLength = data.size();
//		}
////		log.debug("length of response: {}",responseLength);
//		assertTrue(0 < responseLength );
		assertThat(employeeController.getAllNames()).isNotNull();
		assertThat(employeeFacadeImp.getAllNames()).isNotNull();
		assertThat(employeeServiceImp.getAllNames()).isNotNull();


	}

}
