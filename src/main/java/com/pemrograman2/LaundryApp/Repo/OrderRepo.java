package com.pemrograman2.LaundryApp.Repo;

import org.springframework.data.repository.CrudRepository;
import com.pemrograman2.LaundryApp.Entity.Order;

public interface OrderRepo extends CrudRepository<Order, Long> {
}
