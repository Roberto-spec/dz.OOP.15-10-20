package org.itstep.task03;
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
    private City[] cities=new City[0];


    public Country(String name, String continent, String code, City capital, City[] cities) {
        this.name = name;
        this.continent = continent;
        this.code = code;
        this.capital = capital;
        this.cities = cities;
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
        getCities()[cities.length-1].input();
    }
    public  int getInhabitants(){
        int inhabitants=0;
        for(int i=0;i<getCities().length;i++){
            inhabitants+=getCities()[i].getInhabitants();
        }

        return inhabitants;
    }
    public void output() {
       System.out.println("Country: "+getName());
        System.out.println("Continent: "+getContinent());
        System.out.println("Code: "+getCode());
        System.out.println("Capital: ");
        getCapital().output();
        System.out.println("Cities: ");
        for(int i=0;i<getCities().length;i++){
            getCities()[i].output();
        }
        System.out.println("Inhabitants: "+getInhabitants());
    }
    public void input(){
        java.util.Scanner scaner=new Scanner(System.in);
        System.out.println("Enter name contry: ");
        System.out.print(">_");
        setName(scaner.nextLine());
        System.out.println("Enter continent contry: ");
        System.out.print(">_");
        setContinent(scaner.nextLine());
        System.out.println("Enter code contry: ");
        System.out.print(">_");
        setCode(scaner.nextLine());
        System.out.println("Enter capital contry: ");
        getCapital().input();
        int s;
        System.out.println("Enter quantity of contry: ");
        System.out.print(">_");
        s=scaner.nextInt();
        for (int i=0;i<s;i++){
            addCities();
        }
    }
}
