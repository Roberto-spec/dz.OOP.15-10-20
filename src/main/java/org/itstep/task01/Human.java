package org.itstep.task01;

import java.util.Scanner;

/**
 * Задание 1
 * <p>
 * Создайте класс «Человек» (Human).
 * <p>
 * Необходимо хранить в полях класса:
 * - ФИО (fullName),
 * - дату рождения (dateOfBirth),
 * - контактный телефон (phone),
 * - город (city),
 * - страну (country),
 * - домашний адрес (address).
 * <p>
 * Реализуйте методы класса для ввода данных, вывода данных, реализуйте
 * доступ к отдельным полям через методы аксессоры.
 * <p>
 * Создайте два конструктора: один по умолчанию, другой - со 6 параметрами
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Human {
    private String fullName = new String();
    private String dateOfBirth = new String();
    private String phone = new String();
    private String city = new String();
    private String country = new String();
    private String address = new String();


    public Human(String fullName, String dateOfBirth, String phone, String city, String country, String address) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public Human() {
        this.fullName = "default";
        this.dateOfBirth = "default";
        this.phone = "default";
        this.city = "default";
        this.country = "default";
        this.address = "default";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void output(){
        System.out.println("Student: "+getFullName());
        System.out.println("Date of birth: "+getDateOfBirth());
        System.out.println("Contact telephone: "+getPhone());
        System.out.println("From : "+getCountry()+", "+getCity());
        System.out.println("Adress: "+getAddress());


    }
    public void input(){
        Scanner scaner=new Scanner(System.in);
        System.out.println("Enter surname student: ");
        System.out.print(">_ ");
        setFullName(scaner.next());
        System.out.println("Enter name student: ");
        System.out.print(">_ ");
        setFullName(getFullName()+" "+scaner.next());
        System.out.println("Enter lastname student: ");
        System.out.print(">_ ");
        setFullName(getFullName()+" "+scaner.next());
        int g;

        while(true) {
            System.out.println("Enter day of date birth student: ");
            System.out.print(">_ ");
            g = scaner.nextInt();
            if(g>0&g<=31) break;
        }
        setDateOfBirth(g+". ");
        while(true) {
            System.out.println("Enter month of date birth student: ");
            System.out.print(">_ ");
            g = scaner.nextInt();
            if(g>0&g<=12) break;
        }
        setDateOfBirth(getDateOfBirth()+g);
        while(true) {
            System.out.println("Enter year of date birth student: ");
            System.out.print(">_ ");
            g = scaner.nextInt();
            if(g>1980&g<=2008) break;
        }
        setDateOfBirth(getDateOfBirth()+" ."+g);
        System.out.println("Enter contact telephone student: ");
        System.out.print(">_ ");

        setPhone(scaner.next());

        System.out.println("Enter contry student: ");
        System.out.print(">_ ");

        setCountry(scaner.next());
        System.out.println("Enter city student: ");
        System.out.print(">_ ");

        setCity(scaner.next());
        System.out.println("Enter street student: ");
        System.out.print(">_ ");

        setAddress(scaner.next());
        System.out.println("Enter number street student: ");
        System.out.print(">_ ");

        setAddress(getAddress()+" "+scaner.next());




    }
}
