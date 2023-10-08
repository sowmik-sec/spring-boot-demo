package com.sowmik.springbootdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
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
