package com.pemrograman2.LaundryApp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pemrograman2.LaundryApp.Entity.Order;
import com.pemrograman2.LaundryApp.Repo.OrderRepo;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;

    public Order save(Order order){
        return orderRepo.save(order);
    }

    public Iterable<Order> findAll(){
        return orderRepo.findAll();
    } 

    public Order findOne (Long id){
        return orderRepo.findById(id).get();
    }

    public void removeOne (Long id){
        orderRepo.deleteById(id);
    }


    
}
