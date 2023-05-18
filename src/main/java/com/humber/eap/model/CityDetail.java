package com.humber.eap.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CityDetail {
	private String name;
	private double humidity;
	private double temp;

}
