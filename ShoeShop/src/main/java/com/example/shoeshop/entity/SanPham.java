package com.example.shoeshop.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sanpham")
public class SanPham {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tensanpham")
    private String tensanpham;
    
    @Column(name = "mota")
    private String mota;
    
    @Column(name = "hinh1")
    private String hinh1;
    
    @Column(name = "hinh2")
    private String hinh2;
    
    @Column(name = "hinh3")
    private String hinh3;
    
    @Column(name = "hinh4")
    private String hinh4;
    
    @Column(name = "dongia")
    private Double price;
    
    @Column(name = "soluong")
    private Long soluong;
    
    @ManyToOne
    @JoinColumn(name = "danhmuc_id")
    private DanhMuc danhmuc;
    
    @ManyToOne
    @JoinColumn(name = "NSX_id")
    private NSX nsx;
}
