package com.my.services.model;

public class CountryOutput {
	String name,capital , currency;
	int population;
	
	
	
	
	public CountryOutput(String name, String capital, String currency, int population) {
		super();
		this.name = name;
		this.capital = capital;
		this.currency = currency;
		this.population = population;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	@Override
	public String toString() {
		return "CountryOutput [name=" + name + ", capital=" + capital + ", currency=" + currency + ", population="
				+ population + "]";
	}

}
