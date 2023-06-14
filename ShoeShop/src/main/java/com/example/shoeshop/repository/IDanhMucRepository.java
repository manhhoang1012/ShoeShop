package com.example.shoeshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.shoeshop.entity.DanhMuc;

@Repository
public interface IDanhMucRepository extends JpaRepository<DanhMuc, Long>{

}
