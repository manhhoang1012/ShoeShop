package com.example.shoeshop.services;


import com.example.shoeshop.entity.DanhMuc;
import com.example.shoeshop.entity.NSX;
import com.example.shoeshop.repository.INSXRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NSXService {
    @Autowired
    private INSXRepository nsxRepository;

    public List<NSX> getAllNSX(){
        return nsxRepository.findAll();
    }

    public NSX getNSXById(Long id) {
        Optional<NSX> optional = nsxRepository.findById(id);
        return optional.orElse(null);
    }

    public void save(NSX nsx) {
        nsxRepository.save(nsx);
    }

    public void delete (Long id) {
        nsxRepository.deleteById(id);
    }
}
