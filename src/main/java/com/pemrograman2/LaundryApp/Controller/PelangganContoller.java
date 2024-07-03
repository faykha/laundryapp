package com.pemrograman2.LaundryApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pemrograman2.LaundryApp.Entity.Pelanggan;
import com.pemrograman2.LaundryApp.Service.PelangganService;

@RestController
@RequestMapping("/laundryapp/pelanggan")
public class PelangganContoller {

    @Autowired
    private PelangganService pelangganService;

    @PostMapping
    public Pelanggan create(@RequestBody Pelanggan pelanggan) {
        return pelangganService.save(pelanggan);
    }

    @GetMapping
    public Iterable<Pelanggan> findAll() {
        return pelangganService.findAll();
    }

    @PutMapping
    public Pelanggan update(@RequestBody Pelanggan pelanggan) {
        return pelangganService.save(pelanggan);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        pelangganService.removeOne(id);
    }

    @GetMapping("/{id}")
    public Pelanggan findOne(@PathVariable("id") Long id) {
        return pelangganService.findOne(id);
    }
}
