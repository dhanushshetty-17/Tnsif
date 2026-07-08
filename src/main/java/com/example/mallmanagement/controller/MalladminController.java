package com.example.mallmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.mallmanagement.entity.Malladmin;
import com.example.mallmanagement.service.MalladminService;

@RestController
public class MalladminController {

    @Autowired
    private MalladminService ms;

    @PostMapping("/savemalladmin")
    public Malladmin registerMalladmin(@RequestBody Malladmin m) {
        return ms.registerMalladmin(m);
    }
    @PutMapping("/updatemalladmin")
    public Malladmin updateMalladmin(@RequestBody Malladmin m) {
        return ms.updateMalladmin(m);
    }

    @GetMapping("/getmalladmin")
    public List<Malladmin> getMalladmin() {
        return ms.getMalladmins();
    }

    @DeleteMapping("/deletemalladmin/{id}")
    public void deleteMalladmin(@PathVariable Long id) {
        ms.deleteMalladmin(id);
    }
}