package com.my.services.transformer;



import java.text.SimpleDateFormat;
 
import java.util.Calendar;
 

import org.slf4j.Logger;
 
import org.slf4j.LoggerFactory;
 
import org.springframework.integration.annotation.Header;
import org.springframework.stereotype.Component;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
 
 
@Component
public class MyWSTransformer {
 
 static private final Logger logger = LoggerFactory.getLogger(MyWSTransformer.class);
 
 public static String countryRequestSOAPRequest(GetCountryRequest request)
 
 {
 
 logger.info("Calling MyWSTransformer with GetCountryRequest " +request.getName());
  String requestXml =" <gs:getCountryRequest xmlns:gs=\"http://spring.io/guides/gs-producing-web-service\">"+
		       "  <gs:name>"+request.getName()+"</gs:name> "+
      " </gs:getCountryRequest>";
    
  return requestXml; 
 
 }
 
}