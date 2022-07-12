package com.comapny.MonthConverter.controller;

import com.comapny.MonthConverter.model.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathServiceController {

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution addingingTheNums(@RequestBody MathSolution input) {
        input.setOperation("add");
        input.setAnswer();
        return input;
    }

    @PostMapping("/subtract")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution subtractTheNums(@RequestBody MathSolution input) {
        input.setOperation("subtract");
        input.setAnswer();
        return input;
    }

    @PostMapping("/multiply")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution multiplyTheNums(@RequestBody MathSolution input) {
        input.setOperation("multiply");
        input.setAnswer();
        return input;
    }

    @PostMapping("/divide")
    @ResponseStatus(HttpStatus.CREATED)
    public MathSolution divideTheNums(@RequestBody MathSolution input) {
        input.setOperation("divide");
        input.setAnswer();
        return input;
    }

}
