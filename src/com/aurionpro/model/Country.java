package com.aurionpro.model;

public class Country {

	private String countryCode;
	private String countryName;
	private int regionId;

	public Country(String countryCode, String countryName, int regionId) {
		super();
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.regionId = regionId;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	@Override
	public String toString() {
		return "Country [countryCode=" + countryCode + ", countryName=" + countryName + ", regionId=" + regionId + "]";
	}
	
	

}
