package com.my.services.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import com.my.services.api.MyService;

import io.spring.guides.gs_producing_web_service.GetCountryRequest;


@Controller
@RequestMapping
public class CountryController {

	@Autowired
	MyService service;
	
	 @GetMapping("/country")
    public  @ResponseBody String getCountry( @RequestParam(value="name", required=false, defaultValue="Spain") String name) {
		GetCountryRequest request = new GetCountryRequest();
		request.setName(name);
        return service.countryRequest(request).getCountry().getName();
    }
}
