package com.bhuvan.helloworld_mvc.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloWorldController {
    private static Logger logger = LoggerFactory.getLogger(helloWorldController.class) ;

    //UC4
    @RequestMapping("/")
    public String getHelloFromMain(){
        logger.info("Get request received at /");
        return "Hello from Bridgelabz";
    }




    //UC1
@GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
}

}
