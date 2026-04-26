
/*
 *  Name- Vedhas Vijay Khot
 *  UID- 412000445
 */

package edu.rit.projectfinal.controllers;

import edu.rit.projectfinal.services.BranchService;
import edu.rit.projectfinal.entities.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/branches")
public class BranchController {
    @Autowired
    public BranchService branchService;

     @GetMapping
    public List<Branch> getAllBranches() {
        return branchService.findAll();
    }

    @GetMapping("/{id}")
    public List<Branch> getBranchById(@PathVariable Integer id) {
        return branchService.findByBranchID(id);
    }

    @GetMapping("/search")
    public List<Branch> searchByCity(@RequestParam String city) {
        return branchService.findByCity(city);
    }

    @PostMapping
    public Branch createBranch(@RequestBody Branch branch) {
        return branchService.save(branch);
    }

    @PutMapping("/{id}")
    public String updateBranch(@PathVariable Integer id, @RequestBody Branch branch) {
        System.out.println("=== PUT REQUEST RECEIVED ===");
        System.out.println("ID from path: " + id);
        System.out.println("City from body: " + branch.getCity());
        System.out.println("Address from body: " + branch.getAddress());
        System.out.println("Manager from body: " + branch.getBranchManager());

        int result = branchService.updateBranchFull(id,
                branch.getCity(),
                branch.getAddress(),
                branch.getBranchManager());
        System.out.println("Rows affected: " + result);

        if (result > 0) {
            return "Branch updated successfully";
        } else {
            return "Branch not found with ID: " + id;
        }
    }

    @DeleteMapping("/{id}")
    public String deleteBranch(@PathVariable Integer id) {
        branchService.deleteByBranchID(id);
        return "Branch deleted";
    }
}