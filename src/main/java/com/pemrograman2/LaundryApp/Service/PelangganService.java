package com.pemrograman2.LaundryApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pemrograman2.LaundryApp.Entity.Pelanggan;
import com.pemrograman2.LaundryApp.Repo.PelangganRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class PelangganService {

    @Autowired
    private PelangganRepo pelangganRepo; 

    public Pelanggan save (Pelanggan pelanggan) { 
        return pelangganRepo.save(pelanggan);
    }

    public Iterable<Pelanggan> findAll(){
        return pelangganRepo.findAll();
    }

    public Pelanggan findOne (Long id){
        return pelangganRepo.findById(id).get();
    }

    public void removeOne (Long id){
        pelangganRepo.deleteById(id);
    }
    
}
