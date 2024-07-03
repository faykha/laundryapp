package com.pemrograman2.LaundryApp.Repo;

import org.springframework.data.repository.CrudRepository;
import com.pemrograman2.LaundryApp.Entity.Pelanggan;

public interface PelangganRepo extends CrudRepository<Pelanggan, Long> {
}
