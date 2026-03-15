package edu.rit.assignment1;

import model.Car;
import model.Member;
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
    public String getIndexPage() {
        return "index.html";
    }

    @GetMapping("/cars")
    public String showCars (Model model){
        model.addAttribute("members", dataService.getAllCars());
        return "cars";
    }

    @GetMapping("/cars/add")
    public String showAddCars (Model model){
        return "addCars";
    }

    @PostMapping("/cars/add")
    public String addCars (Car carData, Model model){
        dataService.addCars(carData);
        model.addAttribute("entityName", "Car");
        return "success";
    }
}

