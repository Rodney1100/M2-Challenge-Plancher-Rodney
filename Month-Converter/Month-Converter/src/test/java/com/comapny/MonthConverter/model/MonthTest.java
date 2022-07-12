package com.comapny.MonthConverter.model;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

//@Before
//public void seyUp(){
//        month=new Month(1);
//        }

public class MonthTest {

    @Test
    public void givesAMonthWhenItReceiveANumber() {
        int expectedNum = 5;
        String expectedMonth = "May";
        Month month = new Month(5, "May");
        assertEquals(expectedNum , month.getNumber());
        assertEquals(expectedMonth , month.getName());
    }
}