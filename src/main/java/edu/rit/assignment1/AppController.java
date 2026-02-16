package edu.rit.assignment1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index.html";

    }
}
