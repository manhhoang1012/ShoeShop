package com.example.shoeshop.repository;

import com.example.shoeshop.entity.NSX;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INSXRepository extends JpaRepository<NSX, Long> {
}
