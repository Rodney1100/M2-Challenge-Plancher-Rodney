package com.comapny.MonthConverter.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Random;

@RestController
public class RandomMonth {
    @RequestMapping("/randomMonth")
    @ResponseStatus(HttpStatus.OK)
    public String randomMonth() {
        Random randoNum = new Random();
        int randomNum = 1 + randoNum.nextInt(12);
        String returnVal = "I am a return statement";
        switch (randomNum) {
            case 1:
                returnVal = "January";
                break;
            case 2:
                returnVal = "Febuary";
                break;
            case 3:
                returnVal = "March";
                break;
            case 4:
                returnVal = "April";
                break;
            case 5:
                returnVal = "May";
                break;
            case 6:
                returnVal = "June";
                break;
            case 7:
                returnVal = "July";
                break;
            case 8:
                returnVal = "August";
                break;
            case 9:
                returnVal = "September";
                break;
            case 10:
                returnVal = "October";
                break;
            case 11:
                returnVal = "November";
                break;
            case 12:
                returnVal = "December";
                break;
        }
        return returnVal;
    }
}