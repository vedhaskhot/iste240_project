package edu.rit.assignment1;

import Model.MembershipApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {

    @Autowired
    DataService dataService;

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index.html";

    }

    @GetMapping("/applications")
    public String showApplications(Model model){
        model.addAttribute("Applications", dataService.getAllApplications());
        return "applications";
    }

    @GetMapping("/applications/add")
    public String showAddApplication(Model model){
        model.addAttribute("members",dataService.getAllMembers());
        return "addApplication";
    }

    @PostMapping("/applications/add")
    public String addMemberData(MembershipApplication applicationData, Model model){
        dataService.addApplication(applicationData);
        model.addAttribute("entityName","Application");
        return "success";
    }
}