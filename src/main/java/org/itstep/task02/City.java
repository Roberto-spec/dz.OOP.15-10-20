package org.itstep.task02;

import java.awt.*;
import java.util.Scanner;

public class City {
    /*
    название города (name),
 * - название региона (region),
 * - название страны (country),
 * - количество жителей в городе (inhabitants),
 * - почтовый индекс города (index),
 * - телефонный код города (code).

     */
    private String name=new String();
    private String region=new String();
    private String country=new String();
    private int inhabitants;
    private String index=new String();
    private String code=new String();

    public City(String name, String region, String country, int inhabitants, String index, String code) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.inhabitants = inhabitants;
        this.index = index;
        this.code = code;
    }

    public City() {
        this.name = "default";
        this.region = "default";
        this.country = "default";
        this.inhabitants = 0;
        this.index = "default";
        this.code = "default";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void output(){
        System.out.println("City: "+getName());
        System.out.println("Region: "+getRegion());
        System.out.println("Contry: "+getCountry());
        System.out.println("Inhabitants: "+getInhabitants()+" peoples");
        System.out.println("Index: "+getIndex());
        System.out.println("Code: "+getCode());

    }
    public void input(){
        java.util.Scanner scaner=new Scanner(System.in);
        System.out.println("Enter name City: ");
        System.out.print(">_");
        setName(scaner.next());
        System.out.println("Enter Region City: ");
        System.out.print(">_");
        setRegion(scaner.next());
        System.out.println("Enter Contry City: ");
        System.out.print(">_");
        setCountry(scaner.next());
        System.out.println("Enter Inhabitants City: ");
        System.out.print(">_");
        setInhabitants(scaner.nextInt());
        System.out.println("Enter Index City: ");
        System.out.print(">_");
        setIndex(scaner.next());

        System.out.println("Enter Code City: ");
        System.out.print(">_");
        setCode(scaner.next());


    }



}
