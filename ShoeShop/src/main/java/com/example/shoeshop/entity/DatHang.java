package com.example.shoeshop.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "dathang")
public class DatHang {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ngaydat")
	private Date ngaydat;
	
	@Column(name = "tongtien")
	private Long tongtien;
	
	@Column(name = "soluong")
	private String soluong;
	
	@Column(name = "sdt")
	private String sdt;
	
	@Column(name = "diachi")
	private String diachi;
	
	@Column(name = "tennguoinhan")
	private String tennguoinhan;
	
	@ManyToMany
	@JoinTable(name = "chitietdathang", joinColumns = @JoinColumn(name = "dathangID"), inverseJoinColumns = @JoinColumn(name = "sanphamID"))
	Set<SanPham> sanPhams;
}
