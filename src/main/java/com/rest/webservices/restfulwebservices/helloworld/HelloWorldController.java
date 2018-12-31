package com.rest.webservices.restfulwebservices.helloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @GetMapping(path = "/hello")
    public String hello() {
        return "Hello From Web Services";
    }

    @GetMapping(path = "/helloBean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("Hello From Bean");
    }

    @GetMapping(path = "/helloBean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        return new HelloWorldBean("Hello From Bean " + name);
    }

    @GetMapping(path = "/hello-int")
    public String helloInt() {
        return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }
}
