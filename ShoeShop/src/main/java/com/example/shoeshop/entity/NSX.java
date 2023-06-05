package com.example.shoeshop.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "nsx")
public class NSX {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tenNSX")
    private String tenNSX;
    
    @Column(name = "mota")
    private String mota;
    
    @OneToMany(mappedBy = "nsx", cascade = CascadeType.ALL)
    private List<SanPham> sanPhams;
}
