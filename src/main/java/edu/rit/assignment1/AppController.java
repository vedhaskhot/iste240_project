package edu.rit.assignment1;

import model.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import Model.Branch;
import Model.Car;
import Model.Member;
import Model.MembershipApplication;


@Controller
public class AppController {

    @Autowired
    private DataService dataService;

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index";

    }
    @GetMapping("/members")
    public String showMembers(Model model){
        model.addAttribute("members", dataService.getAllMembers());
        return "members";
    }

    @GetMapping("/members/add")
    public String showAddMemberData(Model model){
        model.addAttribute("branches",dataService.getAllbranches());
        return "addMembers";
    }

    @PostMapping("/members/add")
    public String addMemberData(Member memberData, Model model){
        dataService.addMembers(memberData);
        model.addAttribute("entityName","Member");
        return "success";
    }
}
