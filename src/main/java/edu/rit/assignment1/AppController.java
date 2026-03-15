package edu.rit.assignment1;

import model.Car;
import model.Member;
import model.MembershipApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import model.Branch;


@Controller
public class AppController {

    @Autowired
    DataService dataService;

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index.html";}

    @GetMapping("/members")
    public String showMembers(Model model){
        model.addAttribute("members", dataService.getAllMembers());
        return "members";
    }

    @GetMapping("/members/add")
    public String showAddMemberData(Model model){
        model.addAttribute("branches",dataService.getAllBranches());
        return "addMembers";
    }

    @PostMapping("/members/add")
    public String addMemberData(Member memberData, Model model){
        dataService.addMembers(memberData);
        model.addAttribute("entityName","Member");
        return "success";}

    @GetMapping("/branches")
    public String showBranches(Model model){
        model.addAttribute("branches",dataService.getAllBranches());
        return "branches";
    }

    @GetMapping("/cars")
    public String showCars(Model model){
        model.addAttribute("members", dataService.getAllCars());
        return "cars";
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

    @GetMapping("/cars/add")
    public String showAddCars(Model model){
        return "addCars";
    }

    @PostMapping("/cars/add")
    public String addCars(Car carData, Model model){
        dataService.addCars(carData);
        model.addAttribute("entityName","Car");
        return "success";
    }
    @GetMapping("/branches/add")
    public String showAddBranchForm(Model model){
        return "branch-add";
    }
    @PostMapping("/branches/add")
    public String addBranch( Branch branch, Model model) {
        dataService.addBranch(branch);
        model.addAttribute("entityName","branch");
        return "success";
    }

}
