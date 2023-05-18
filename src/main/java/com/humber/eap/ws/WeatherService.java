package com.humber.eap.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.humber.eap.model.CityDetail;

@WebService
public class WeatherService {

	@WebMethod
	public CityDetail GetWeatherReport(String name) {
		CityDetail city = new CityDetail(name, 0, 0);
		city.setHumidity((int)(Math.random() * 100) + 1);
		city.setTemp((int)(Math.random() * 50) + 1);
		return city;
	}
}
