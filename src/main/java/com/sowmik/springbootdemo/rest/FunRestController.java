package com.sowmik.springbootdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${coach.team}")
    private  String teamName;

    @GetMapping("/teaminfo")
    public String teaminfo(){
        return "Team name: " + teamName + " coach name: " + coachName;
    }
    @GetMapping("/")
    public String hay(){
        return "Hello World";
    }
    @GetMapping("/workout")
    public String workout(){
        return "Run a hard 5K";
    }
    @GetMapping("/fortune")
    public String fortune(){
        return "dull day";
    }
}
