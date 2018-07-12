package io.github.crawlerbot.cucumber.stepdefs;

import io.github.crawlerbot.CrawlerConfigurationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CrawlerConfigurationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
