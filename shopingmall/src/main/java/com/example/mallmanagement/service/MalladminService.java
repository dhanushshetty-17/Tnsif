package com.example.mallmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mallmanagement.entity.Malladmin;
import com.example.mallmanagement.repository.MalladminRepository;

@Service
public class MalladminService {

    @Autowired
    private MalladminRepository mr;

    public Malladmin registerMalladmin(Malladmin m) {
        return mr.save(m);
    }

    public List<Malladmin> getMalladmins() {
        return (List<Malladmin>) mr.findAll();
    }

    public void deleteMalladmin(Long id) {
        mr.deleteById(id);
    }
    public Malladmin updateMalladmin(Malladmin m) {
        return mr.save(m);
    }
}