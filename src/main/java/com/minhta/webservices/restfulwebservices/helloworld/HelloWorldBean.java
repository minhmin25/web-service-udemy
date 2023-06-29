package com.minhta.webservices.restfulwebservices.helloworld;

import lombok.Getter;
import lombok.Setter;

public class HelloWorldBean {
    @Getter @Setter
    private String message;
    public HelloWorldBean(String message) {
        this.message = message;
    }
}
