package com.comapny.MonthConverter.controller;

import com.comapny.MonthConverter.model.Month;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Random;

@RestController
public class RandomMonth {
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
                return new Month(2, "Febuary");
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
        }
//            case 1:
//                return new Month(1, "January");
//                break;
//            case 2:
//                returnVal = new Month(randomNum,"Febuary");
//                break;
//            case 3:
//                returnVal = new Month(randomNum,"March");
//                break;
//            case 4:
//                returnVal = new Month(randomNum,"April");
//                break;
//            case 5:
//                returnVal = new Month(randomNum,"May");
//                break;
//            case 6:
//                returnVal =new Month(randomNum, "June");
//                break;
//            case 7:
//                returnVal =new Month(randomNum, "July");
//                break;
//            case 8:
//                returnVal = new Month(randomNum,"August");
//                break;
//            case 9:
//                returnVal =new Month(randomNum, "September");
//                break;
//            case 10:
//                returnVal =new Month(randomNum, "October");
//                break;
//            case 11:
//                returnVal =new Month(randomNum, "November");
//                break;
//            case 12:
//                returnVal = new Month(randomNum,"December");
//                break;
//        }
//        return returnVal;

        return null;
    }
}
