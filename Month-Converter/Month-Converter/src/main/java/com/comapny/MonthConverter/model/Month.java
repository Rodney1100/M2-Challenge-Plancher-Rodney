package com.comapny.MonthConverter.model;

public class Month {
    //    vars for the months return
    private int number;
    private String name;

    //    generated constructor

    public Month(int number, String name) {
        this.number = number;
        this.name = name;
    }

    //    general
    public Month() {
    }

//    generated getter and setter below

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //    generated to string method

    @Override
    public String toString() {
        return "Month{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
