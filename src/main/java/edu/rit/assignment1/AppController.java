package edu.rit.assignment1;

import model.MembershipApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class AppController {

    @Autowired
    private DataService dataService;


    @GetMapping("/")
    public String home(){
        return "index";
    }



    @GetMapping("/applications")
    public String showApplications(Model model){
        model.addAttribute("applications", dataService.getAllApplications());
        return "applications";
    }


    @GetMapping("/applications/add")
    public String showAddApplicationForm(Model model){
        model.addAttribute("application", new MembershipApplication());
        return "application-add";
    }


    @PostMapping("/applications/add")
    public String addApplication(@ModelAttribute MembershipApplication application, Model model) {
        dataService.addApplication(application);
        model.addAttribute("entityName", "Application");
        return "success";
    }
}