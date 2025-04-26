package com.bhuvan.helloworld_mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class htmlController {
    @GetMapping("/hello/view")
    public String getView(Model model){
        model.addAttribute("result","hello from bridgelabz");
        return "result";
    }

}
