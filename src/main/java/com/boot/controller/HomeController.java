package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johncollins on 3/7/17.
 */
@RestController
public class HomeController
{

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return "Das Boot, reporting for duty!";
    }
}
