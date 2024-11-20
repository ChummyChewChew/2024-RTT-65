package org.leorodriguez.simplethymleafexample.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //This class is a controller
public class HelloWorldController {

    @GetMapping({"/showview"})

    public String sendDataTwo (Model model) {
        String message ="PerScholas ! We are learning Thymleaf";
    model.addAttribute("myvar", message);
    return "myview";
    }
}
