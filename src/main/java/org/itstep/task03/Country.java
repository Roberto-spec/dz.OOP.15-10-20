package org.itstep.task03;
import org.itstep.Input;
import org.itstep.task02.City;

import java.util.Arrays;
import java.util.Scanner;

public class Country {
   /* название страны (name),
 * - название континента (continent),
 * - телефонный код страны (code),
 * - название столицы (capital - класс City),
 * - города страны (cities - массив City).
            **/

    private String name=new String();
    private String continent=new String();
    private String code=new String();
    private City capital= new City();
    private City[] cities;


    public Country(String name, String continent, String code, City capital, City[] cities) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities = cities;
    }
    public Country(String name, String continent, String code, City capital){
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities =new City[0];
    }

    public Country() {
        this.name = "default";
        this.continent = "default";
        this.code = "default";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public City[] getCities() {
        return cities;
    }

    public void setCities(City[] cities) {
        this.cities = cities;
    }
    public void addCities() {
        cities= Arrays.copyOf(cities,cities.length+1);
        Input input=new Input();
        getCities()[cities.length-1]=input.input_City();
    }
    public void addCities(City  city) {
        cities= Arrays.copyOf(cities,cities.length+1);
        Input input=new Input();
        getCities()[cities.length-1]=city;
    }
    public void addCities(String name, String region, String country, int inhabitants, String index, String code) {
        cities= Arrays.copyOf(cities,cities.length+1);
        Input input=new Input();
        getCities()[cities.length-1]=new City(name,  region,  country,  inhabitants,  index,  code);
    }


    public  int getInhabitants(){
        int inhabitants=0;
        for(int i=0;i<getCities().length;i++){
            inhabitants+=getCities()[i].getInhabitants();
        }
        inhabitants+=getCapital().getInhabitants();
        return inhabitants;
    }


}
