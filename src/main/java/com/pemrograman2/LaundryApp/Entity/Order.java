package com.pemrograman2.LaundryApp.Entity;

import java.sql.Date;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_order")
@Setter
@Getter
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String jenisPelayanan;

    @Column(length = 10, nullable = false)
    private Long totalBiaya;

    @Column
    private Date tanggal;

    @ManyToOne
    @JoinColumn(name = "pelanggan_id", nullable = false)
    private Pelanggan pelanggan;
}
