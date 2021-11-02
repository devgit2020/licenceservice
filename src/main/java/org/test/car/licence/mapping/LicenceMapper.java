package org.test.car.licence.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.test.car.licence.model.LicenceInfo;

@Mapper(componentModel = "spring")
public interface LicenceMapper {
	
	LicenceMapper INSTANCE = Mappers.getMapper(LicenceMapper.class);
	
	public abstract LicenceInfo objectToLiceseInfo(Object obj);

}
