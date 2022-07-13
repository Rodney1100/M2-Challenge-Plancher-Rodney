package com.comapny.MonthConverter.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.comapny.MonthConverter.model.MathSolution;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.http.MediaType;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@WebMvcTest(Math.class)

public class MathServiceControllerTest {
    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldReturnMathSolutionWhenAdd() throws Exception {
        double uperand1 = 6.0;
        double uperand2 = 2.0;
        double expectedOutput = 8.0;
        MathSolution newMathSolution = new MathSolution((double) uperand1, (double) uperand2, "add", expectedOutput );
        double actualOutput = newMathSolution.getAnswer();

        String inputJSON = mapper.writeValueAsString(actualOutput);

        mockMvc.perform(
                        post("/add")
                                .content(inputJSON)
                                .contentType(MediaType.APPLICATION_JSON)
                )
                .andDo(print())
                .andExpect(status().isCreated())
                .andExpect(content().json(outputJSON));
    }
}