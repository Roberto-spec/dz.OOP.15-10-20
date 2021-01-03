package org.itstep;

import org.itstep.task02.City;
import org.itstep.task03.Country;

public class Output {

    public void output_city(City city){
        System.out.println("City: "+city.getName());
        System.out.println("Region: "+city.getRegion());
        System.out.println("Contry: "+city.getCountry());
        System.out.println("Inhabitants: "+city.getInhabitants()+" peoples");
        System.out.println("Index: "+city.getIndex());
        System.out.println("Code: "+city.getCode());

    }
    public void output_Country(Country country) {
        System.out.println("Country: "+country.getName());
        System.out.println("Continent: "+country.getContinent());
        System.out.println("Code: "+country.getCode());
        System.out.println("Capital: ");
        output_city(country.getCapital());
        System.out.println("Cities: ");
        for(int i=0;i<country.getCities().length;i++){
            output_city(country.getCities()[i]);
        }
        System.out.println("Inhabitants: "+country.getInhabitants());
    }
}
