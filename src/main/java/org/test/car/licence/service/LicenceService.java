package org.test.car.licence.service;

import java.util.List;

import org.test.car.licence.model.LicenceInfo;

/**
 * @author JavaSolutionsGuide
 *
 */
public interface LicenceService {

	public List<LicenceInfo> getLicenceDetail(String brand,String model,String chassiNumber);
  
 }
