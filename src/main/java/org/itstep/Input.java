package org.itstep;

import org.itstep.task02.City;
import org.itstep.task03.Country;

import java.util.Scanner;

public class Input {

    private java.util.Scanner scaner=new Scanner(System.in);
    public Country input_country(){
        Country country=new Country();
        System.out.println("Enter name contry: ");
        System.out.print(">_");
        country.setName(scaner.nextLine());
        System.out.println("Enter continent contry: ");
        System.out.print(">_");
        country.setContinent(scaner.nextLine());
        System.out.println("Enter code contry: ");
        System.out.print(">_");
        country.setCode(scaner.nextLine());
        System.out.println("Enter capital contry: ");
        country.setCapital(input_City());
        int s;
        System.out.println("Enter quantity of contry: ");
        System.out.print(">_");
        s=scaner.nextInt();
        int a=1;
        do {
            country.addCities(input_City());
            System.out.println("Добавить еще город?");
            System.out.println("[1] DA");
            System.out.println("[2] NET");
            a=scaner.nextInt();
        }while(a!=2);

        return  country;
    }

    public City input_City(){
        City city=new City(input_Name_city(), input_Region(), input_Coutry_city(), input_Inhabitans(), input_Index_city(), input_Code_city());
        return city;
    }
    private String input_Name_city(){
        System.out.println("Enter name City: ");
        System.out.print(">_");
        String s=new String();
        do{
            s=scaner.nextLine();
        }while(s.length()<2);
        return s;
    }
    private String input_Region(){
        System.out.println("Enter Region City: ");
        System.out.print(">_");
        String s=new String();
        do{
            s=scaner.nextLine();
        }while(s.length()<2);
        return s;
    }
    private String input_Coutry_city(){
        System.out.println("Enter Contry City: ");
        System.out.print(">_");
        String s=new String();
        do{
            s=scaner.nextLine();
        }while(s.length()<2);
        return s;
    }
    private int input_Inhabitans(){
     int s;
        System.out.println("Enter Inhabitants City: ");
        System.out.print(">_");
        do{
            s=scaner.nextInt();
        }while(s<0);
     return s;
    }
    private String input_Index_city(){
        String s=new String();
        System.out.println("Enter Index City: ");
        System.out.print(">_");
        do{
            s=scaner.nextLine();
        }while(s.length()<2);

        return s;
    }
    private String input_Code_city(){
        String s=new String();
        System.out.println("Enter Code City: ");
        System.out.print(">_");
        do{
            s=scaner.nextLine();
        }while(s.length()<2);

        return s;
    }


}


