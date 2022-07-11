package com.comapny.MonthConverter.model;

public class Month {
    //    vars for the months return
    private int monthNum;
    private String monthName;

    //    generated constructor

    public Month(int monthNum, String monthName) {
        this.monthNum = monthNum;
        this.monthName = monthName;
    }

    //    general
    public Month() {
    }

//    generated getter and setter below

    public int getMonthNum() {
        return monthNum;
    }

    public void setMonthNum(int monthNum) {
        this.monthNum = monthNum;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }


    //    generated to string method

    @Override
    public String toString() {
        return "Month{" +
                "monthNum=" + monthNum +
                ", monthName='" + monthName + '\'' +
                '}';
    }
}
