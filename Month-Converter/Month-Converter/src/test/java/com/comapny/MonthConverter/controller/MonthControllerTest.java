package com.comapny.MonthConverter.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.comapny.MonthConverter.model.Month;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(MonthController.class)
public class MonthControllerTest {
    @Autowired
    private MockMvc mockMvc;
    private ObjectMapper mapper = new ObjectMapper();

    @Test
    public void shouldCreateAMonthToTestWithTheInput() throws Exception {


        Month outputSolution = new Month(1, "January");
        String outputJSON = mapper.writeValueAsString(outputSolution);

        // ACT
        mockMvc.perform(
                        get("/month/1")
                )
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().json(outputJSON));
    }
}