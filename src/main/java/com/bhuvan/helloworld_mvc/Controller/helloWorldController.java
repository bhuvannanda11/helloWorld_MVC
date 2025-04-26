package com.bhuvan.helloworld_mvc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
    //UC3
    @RequestMapping("/")
    public String getHelloFromMain(){
        return "Hello from Bridgelabz";
    }




    //UC1
@GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
}

}
