package com.pemrograman2.LaundryApp.Entity;


import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_pelanggan")
@Setter
@Getter
public class Pelanggan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false, unique = true)
    private String nama;

    @Column(length = 15, nullable = false, unique = true)
    private Long telp;

   
}
