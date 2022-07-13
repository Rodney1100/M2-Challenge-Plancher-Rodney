package com.comapny.MonthConverter.controller;

import com.comapny.MonthConverter.model.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Random;

@RestController
public class RandomMonthController {
    @RequestMapping("/randomMonth")
    @ResponseStatus(HttpStatus.OK)
    public Month randomMonth() {
        Random randoNum = new Random();
        int randomNum = 1 + randoNum.nextInt(12);
//        String returnVal = "return statement";

//        send the month and return nothing
        switch (randomNum) {
            case 1:
                return new Month(1, "January");
            case 2:
                return new Month(2, "February");
            case 3:
                return new Month(3, "March");
            case 4:
                return new Month(4, "April");
            case 5:
                return new Month(5, "May");
            case 6:
                return new Month(6, "June");
            case 7:
                return new Month(7, "July");
            case 8:
                return new Month(8, "August");
            case 9:
                return new Month(9, "September");
            case 10:
                return new Month(10, "October");
            case 11:
                return new Month(11, "November");
            case 12:
                return new Month(12, "December");
            default:
                throw new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY, "Invalid Month Number was created somehow.");
        }
    }
}
