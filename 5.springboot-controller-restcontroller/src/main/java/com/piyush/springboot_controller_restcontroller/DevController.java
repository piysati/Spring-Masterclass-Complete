package com.piyush.springboot_controller_restcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DevController {

    @GetMapping("/name-controller")
    public String getName(){
        return "name-controller";
    }

}
