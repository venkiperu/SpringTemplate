package com.gnovoa.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.Properties;

@Controller
public class HelloController
{
    private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@Resource (name = "systemProperties")
	Properties systemProperties;

	@Resource (name = "allProperties")
	Properties properties;

	@RequestMapping(value="/", method= RequestMethod.GET)
	public String printWelcome(ModelMap model)
    {

        log.info("this is a info msg");
        log.debug("this is a debug msg");
        log.warn("this is a warn msg");
        log.error("this is a error msg");
		model.addAttribute("message", "Hello world!");
		return "hello";
	}
}