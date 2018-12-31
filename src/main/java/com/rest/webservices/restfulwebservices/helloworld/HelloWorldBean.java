package com.rest.webservices.restfulwebservices.helloworld;

public class HelloWorldBean {

    private String message;

    public HelloWorldBean(String message) {

        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() { // if you don't provide getter method, rest call will return error 500 as it's not able to convert HelloWorldBean object to json
        return message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
