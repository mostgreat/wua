package com.wua.wiseup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootStrapImage {

    @GetMapping("/bootStrap")
    public String showBootStrap() {
        return "bootStrap.html";
    }
}
