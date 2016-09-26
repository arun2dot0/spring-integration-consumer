package com.my.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import com.my.services.api.MyService;
import com.my.services.model.CountryOutput;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;
import io.spring.guides.gs_producing_web_service.GetCountryResponse;


@Controller
@RequestMapping
public class CountryController {

	@Autowired
	MyService service;
	
	 @GetMapping("/country")
    public  @ResponseBody CountryOutput getCountry( @RequestParam(value="name", required=false, defaultValue="Spain") String name) {
		GetCountryRequest request = new GetCountryRequest();
		request.setName(name);
        GetCountryResponse response = service.countryRequest(request);
		CountryOutput country = new CountryOutput(response.getCountry().getName(),response.getCountry().getCapital(),
												  response.getCountry().getCurrency().toString(),response.getCountry().getPopulation()
												);
		return country;
    }
}
