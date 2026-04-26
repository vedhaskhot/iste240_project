package edu.rit.projectfinal.services;

import edu.rit.projectfinal.entities.Branch;
import edu.rit.projectfinal.repositories.BranchRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class BranchService {
    @Autowired
    private BranchRepository branchRepository;

    public List<Branch> findAll() {
        return branchRepository.findAll();
    }

    public List<Branch> findByBranchID(Integer branchID) {
        return branchRepository.findByBranchID(branchID);
    }

    public List<Branch> findByCity(String city) {
        return branchRepository.findByCity(city);
    }

    public List<Branch> findByAddress(String address) {
        return branchRepository.findByAddress(address);
    }

    public List<Branch> findByBranchManager(String branchManager) {
        return branchRepository.findByBranchManager(branchManager);
    }
    public Branch save(Branch branch) {
        return branchRepository.save(branch);

    }

    public int updateBranchFull(Integer id, String city, String address, String manager) {
        return branchRepository.updateBranchFull(id, city, address, manager);
    }
    public void deleteByBranchID(Integer branchID) {
        branchRepository.deleteById(branchID);
    }

    public void deleteByCity(String city) {
        branchRepository.deleteByCity(city);
    }

    public void deleteByAddress(String address) {
        branchRepository.deleteByAddress(address);
    }

    public void deleteByBranchManager(String branchManager) {
        branchRepository.deleteByBranchManager(branchManager);
    }
}


