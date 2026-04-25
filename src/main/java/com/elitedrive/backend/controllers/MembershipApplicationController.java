// By: Akhil Biju (752000700)
package com.elitedrive.backend.controllers;

import com.elitedrive.backend.entities.MembershipApplication;
import com.elitedrive.backend.services.MembershipApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/applications")
public class MembershipApplicationController {

    @Autowired
    private MembershipApplicationService service;

    @GetMapping
    public List<MembershipApplication> getAllApplications() {
        return service.getAllApplications();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MembershipApplication> getApplicationById(@PathVariable Long id) {
        Optional<MembershipApplication> app = service.getApplicationById(id);
        return app.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public List<MembershipApplication> searchApplications(@RequestParam String status) {
        return service.getApplicationsByStatus(status);
    }

    @PostMapping
    public MembershipApplication createApplication(@RequestBody MembershipApplication application) {
        return service.saveApplication(application);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MembershipApplication> updateApplication(@PathVariable Long id, @RequestBody MembershipApplication details) {
        Optional<MembershipApplication> app = service.getApplicationById(id);
        if (app.isPresent()) {
            MembershipApplication existing = app.get();
            existing.setApplicantName(details.getApplicantName());
            existing.setEmail(details.getEmail());
            existing.setLicenseNumber(details.getLicenseNumber());
            existing.setStatus(details.getStatus());
            return ResponseEntity.ok(service.saveApplication(existing));
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteApplication(@PathVariable Long id) {
        service.deleteApplication(id);
        return ResponseEntity.ok().build();
    }
}