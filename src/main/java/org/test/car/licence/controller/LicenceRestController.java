package org.test.car.licence.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.test.car.licence.model.LicenceInfo;
import org.test.car.licence.service.LicenceService;

/**
 * @author Santosh Behera
 *
 */
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class LicenceRestController {
	
	@Autowired
	private LicenceService licenceService;

	
	@GetMapping("api/licence/{make}/{model}/{chassiNumber}")
	public List<LicenceInfo> getLicenceInfo(
			@PathVariable(name = "make") String make,
			@PathVariable(name = "model") String model,
			@PathVariable(name = "chassiNumber") String chassiNumber) {
		
		return licenceService.getLicenceDetail(make,model,chassiNumber);
		
	}



}
