// By: Akhil Biju (752000700)
package com.elitedrive.backend.components;

import com.elitedrive.backend.entities.MembershipApplication;
import com.elitedrive.backend.repositories.MembershipApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MembershipSeeder implements CommandLineRunner {

    @Autowired
    private MembershipApplicationRepository repository;

    @Override
    public void run(String... args) throws Exception {
        if (repository.count() == 0) {

            MembershipApplication app1 = new MembershipApplication();
            app1.setApplicantName("John Doe");
            app1.setEmail("john.doe@example.com");
            app1.setLicenseNumber("UAE-1234567");
            app1.setStatus("PENDING");
            app1.setSubmissionDate(LocalDate.now().minusDays(2));

            MembershipApplication app2 = new MembershipApplication();
            app2.setApplicantName("Jane Smith");
            app2.setEmail("jane.smith@example.com");
            app2.setLicenseNumber("UAE-9876543");
            app2.setStatus("APPROVED");
            app2.setSubmissionDate(LocalDate.now().minusDays(5));

            MembershipApplication app3 = new MembershipApplication();
            app3.setApplicantName("Mike Johnson");
            app3.setEmail("mike.j@example.com");
            app3.setLicenseNumber("UAE-5555555");
            app3.setStatus("REJECTED");
            app3.setSubmissionDate(LocalDate.now().minusDays(10));

            repository.save(app1);
            repository.save(app2);
            repository.save(app3);

            System.out.println("✅ Membership applications successfully seeded!");
        }
    }
}