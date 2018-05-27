package com.aheffernan.salesforce.cucumber.stepdefs;

import com.aheffernan.salesforce.SalesforceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SalesforceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
