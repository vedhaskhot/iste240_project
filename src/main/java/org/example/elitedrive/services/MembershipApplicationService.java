// By: Akhil Biju (752000700)
package org.example.elitedrive.services;

import org.example.elitedrive.entities.MembershipApplication;
import org.example.elitedrive.repositories.MembershipApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembershipApplicationService {

    @Autowired
    private MembershipApplicationRepository repository;

    public MembershipApplication saveApplication(MembershipApplication application) {
        return repository.save(application);
    }

    public List<MembershipApplication> getAllApplications() {
        return repository.findAll();
    }

    public Optional<MembershipApplication> getApplicationById(Long id) {
        return repository.findById(id);
    }

    public void deleteApplication(Long id) {
        repository.deleteById(id);
    }

    public List<MembershipApplication> getApplicationsByStatus(String status) {
        return repository.findByStatusCustom(status);
    }

    public void updateApplicationStatus(Long id, String newStatus) {
        repository.updateStatusById(id, newStatus);
    }
}