package com.piyush.springboot_controller_restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevRestController {

    @GetMapping("/name-rest")
    public String getName(){
        return "Piyush";
    }

}
