package com.tutorialspoint;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {

    private String message;

    public String getMessage() {
       return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void init() {
        System.out.println(message + " :This is init method");
    }

    public void des() {
        System.out.println(message + " :This is desory method");
    }

    public void start() {
        System.out.println(message + " :This is default init method");
    }

    public void destroy() {
        System.out.println(message + " :This is default destroy method");
    }
}
