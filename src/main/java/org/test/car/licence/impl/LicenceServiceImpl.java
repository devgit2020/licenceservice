package org.test.car.licence.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.test.car.licence.model.LicenceInfo;
import org.test.car.licence.service.LicenceService;

/**
 * @author JavaSolutionsGuide
 *
 */
@Service
public class LicenceServiceImpl implements LicenceService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${spring.car.service}")
	private String CAR_SERVICE_URL;

	@Value("${spring.vechile.service}")
	private String VECHILE_SERVICE_URL;

	public List<LicenceInfo> getLicenceDetail(String make, String model, String chassiNumber) {

		
		Map<String, String> carMap = restTemplate.getForObject(CAR_SERVICE_URL + "/" + chassiNumber, Map.class);

		List<LicenceInfo> licenceInfo = new ArrayList<>();

		if (carMap != null && !carMap.isEmpty()) {
			
			
			String vechMap = restTemplate.getForObject(VECHILE_SERVICE_URL + "/" + make + "/" + model, String.class);
						
			try {
				JSONArray array = new JSONArray(vechMap);

				for (int i = 0; i < array.length(); i++) {
					JSONObject object = array.getJSONObject(i);
					
					LicenceInfo licence = new LicenceInfo();
					licence.setC_number(carMap.get("chassisNumber"));
					licence.setValid_from(String.valueOf(object.get("date_added")));
					licence.setExp_date(carMap.get("date_added"));
					licence.setLicense_plate("XXXXSESS");
					licenceInfo.add(licence);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		return licenceInfo;

	}

}
