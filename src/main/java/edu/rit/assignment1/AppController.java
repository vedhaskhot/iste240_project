package edu.rit.assignment1;

import model.Car;
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
    DataService dataService;

    @RequestMapping("/index")
    public String getIndexPage(){
        return "index.html";
    private DataService dataService;

    @GetMapping("/")
    public String home(){
        return "index.html";
    }
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

    @GetMapping("/cars/add")
    public String showAddCars(Model model){
        return "addCars";
    }

    @PostMapping("/cars/add")
    public String addCars(Car carData, Model model){
        dataService.addCars(carData);
        model.addAttribute("entityName","Car");
        return "success";
    }}
    @GetMapping("/branches/add")
    public String showAddBranchForm(Model model){
        model.addAttribute("branch",new Branch());
        return "branch-add";
    }
    @PostMapping("/branches/add")
    public String addBranch( Branch branch, Model model) {
        dataService.addBranch(branch);
        model.addAttribute("entityName","branch");
        return "success";
    }

}
