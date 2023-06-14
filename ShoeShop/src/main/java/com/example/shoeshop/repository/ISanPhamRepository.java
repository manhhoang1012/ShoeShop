package com.example.shoeshop.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoeshop.entity.SanPham;

@Repository
public interface ISanPhamRepository extends JpaRepository<SanPham, Long> {

}
