package com.rest.webservices.restfulwebservices.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

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

}
