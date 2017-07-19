package com.mattfirtion.calendar.cucumber.stepdefs;

import com.mattfirtion.calendar.CalendarApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CalendarApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
