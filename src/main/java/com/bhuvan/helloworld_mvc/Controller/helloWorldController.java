package com.bhuvan.helloworld_mvc.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
@GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
}

}
