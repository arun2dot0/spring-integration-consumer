package com.my.services.api;



import javax.xml.bind.annotation.XmlElement;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;
 

public interface MyService {
	GetCountryResponse  countryRequest(GetCountryRequest request);
}