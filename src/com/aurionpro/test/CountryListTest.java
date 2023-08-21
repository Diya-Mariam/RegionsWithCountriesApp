package com.aurionpro.test;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

import com.aurionpro.model.Country;
import com.aurionpro.model.Region;

public class CountryListTest {

	public static void main(String[] args) {

		List<Region> regionList = new ArrayList<>();
		regionList.add(new Region(1, "Europe"));
		regionList.add(new Region(2, "Americas"));
		regionList.add(new Region(3, "Asia"));
		regionList.add(new Region(4, "Middle East and Africa"));
		
		List<Country> countryList = new ArrayList<>();
		countryList.add(new Country("IT", "Italy", 1));
		countryList.add(new Country("JP", "Japan", 3));
		countryList.add(new Country("US", "United States of America", 2));
		countryList.add(new Country("CA", "Canada", 2));
		countryList.add(new Country("CN", "China", 3));
		countryList.add(new Country("IN", "India", 3));
		countryList.add(new Country("AU", "Australia", 3));
		countryList.add(new Country("ZW", "Zimbabwe",4));
		countryList.add(new Country("SG", "Singapore", 3));
		countryList.add(new Country("UK", "United Kingdom", 1));
		countryList.add(new Country("FR", "France", 1));
		countryList.add(new Country("DE", "Germany", 1));
		countryList.add(new Country("ZM", "Zambia", 4));
		countryList.add(new Country("EG", "Egypt", 4));
		countryList.add(new Country("BR", "Brazil", 2));
		countryList.add(new Country("CH", "Switzerland", 1));
		countryList.add(new Country("MX", "Mexico", 2));
		countryList.add(new Country("KW", "Kuwait", 4));
		countryList.add(new Country("IL", "Israel", 4));
		countryList.add(new Country("DK", "Denmark", 1));
		countryList.add(new Country("HK", "HongKong", 3));
		countryList.add(new Country("NG", "Nigeria", 4));
		countryList.add(new Country("AR", "Argentina", 2));
		countryList.add(new Country("BE", "Belgium", 1));
		
		Map<Integer, Integer> countMap = new HashMap<>();

		// get the name of country from country code
		
		getNameOfCountryFromCountryCode(countryList);
		getAllCountriesInARegionByRegionId(countryList);
		getTheCountOfCountriesFromEachRegion(countMap, countryList);
	}

	

	private static void getTheCountOfCountriesFromEachRegion(Map<Integer, Integer> countMap, List<Country> countryList) 
	{
		int count=0;
		
		for(Country c: countryList) 
		{
			if(countMap.containsKey(c.getRegionId()))
			{
				count = countMap.get(c.getRegionId());
				countMap.put(c.getRegionId(), ++count);
			}
		}
		
		System.out.println("The count of countries from each region represented by region ids are \n");
		countMap.forEach((key,value)->{
			System.out.println(key+" : "+value);
		});
		
	}



	private static void getAllCountriesInARegionByRegionId(List<Country> countryList) 
	{

		System.out.println("Enter a Region Id: ");
		Scanner sc = new Scanner(System.in);
		int regionId = sc.nextInt();
		
		List<String> countryListWithRegionId = new ArrayList<>();
		
		for(Country c: countryList)
		{
			if(c.getRegionId() == regionId)
			{
				countryListWithRegionId.add(c.getCountryName());
			}
		}
		
		System.out.println(countryListWithRegionId);
		
		
	}

	private static void getNameOfCountryFromCountryCode(List<Country> countryList) {

		System.out.println("Enter a country code: ");
		
		Scanner sc = new Scanner(System.in);
		String countryCode = sc.next().toUpperCase();
		boolean countryCodeTrue = false;
		
		for(Country c: countryList)
		{
			if(c.getCountryCode().equals(countryCode))
			{
				System.out.println(c.getCountryName());
				countryCodeTrue = true;
				break;
			}
			
		}
		if(!countryCodeTrue)
		{
			System.out.println("Country Code not found");
		}
		
	}

}
