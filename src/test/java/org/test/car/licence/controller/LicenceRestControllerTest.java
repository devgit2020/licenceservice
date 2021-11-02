package org.test.car.licence.controller;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.web.client.RestTemplate;
import org.test.car.licence.impl.LicenceServiceImpl;
import org.test.car.licence.model.LicenceInfo;

@RunWith(MockitoJUnitRunner.class)
public class LicenceRestControllerTest extends LicenceRestController {

	@Mock
	LicenceRestController licenceRestController;

	@InjectMocks
	LicenceServiceImpl licenceService;
	
	@Mock
	RestTemplate restTemplate;


	@Test
	public void test() {
		
		assertNotNull(licenceRestController);
		assertNotNull(licenceService);
		
	}
	
	@Test
	public void testGetLicenceInfo() {

		List<LicenceInfo> licenceInfo = new ArrayList<>();
		licenceInfo.add(new LicenceInfo());
		licenceInfo.add(new LicenceInfo());
		
		Mockito.lenient().when(licenceService.getLicenceDetail("testmake","testmodel","testchesisnumber")).thenReturn(licenceInfo);
		
		
		Object  response = licenceRestController.getLicenceInfo("testmake","testmodel","testchesisnumber");
		
		assertNotNull(response);

	}
	

}
