package net.danoun.hospitalapp.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PatientController {

    @GetMapping("/index")
    public String index(){
        return "patients";
    }
}
