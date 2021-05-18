package edu.pingpong.quickstart;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingService {

    public String greetingEn(String name) {
        return "hello " + name;
    }
    public String greetingEs(String name) {
        return "hola " + name;
    }
}

