package com.pemrograman2.LaundryApp.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.pemrograman2.LaundryApp.Entity.Order;
import com.pemrograman2.LaundryApp.Service.OrderService;

@RestController
@RequestMapping("/laundryapp/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.save(order);
    }

    @GetMapping
    public Iterable<Order> findAll() {
        return orderService.findAll();
    }

    @PutMapping
    public Order update(@RequestBody Order order) {
        return orderService.save(order);
    }

    @DeleteMapping("/{id}")
    public void removeOne(@PathVariable("id") Long id) {
        orderService.removeOne(id);
    }

    @GetMapping("/{id}")
    public Order findOne(@PathVariable("id") Long id) {
        return orderService.findOne(id);
    }
}
