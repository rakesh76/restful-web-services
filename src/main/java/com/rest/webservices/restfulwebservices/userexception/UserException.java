package com.rest.webservices.restfulwebservices.userexception;

import java.util.Date;

public class UserException {

    private Date date;
    private String message;
    private  String detailMessage;


    public UserException(Date date, String message, String detailMessage) {
        super();
        this.date = date;
        this.message = message;
        this.detailMessage = detailMessage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }
}
