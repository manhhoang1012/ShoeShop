package com.example.shoeshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoeshop.entity.SanPham;
import com.example.shoeshop.repository.ISanPhamRepository;

@Service
public class SanPhamService {
	
	@Autowired
	private ISanPhamRepository sanPhamRepository;
	
	public List<SanPham> getAllSanPham(){
		return sanPhamRepository.findAll();
	}
	
	public SanPham getSanPhamById(Long id) {
		Optional<SanPham> optional = sanPhamRepository.findById(id);
		return optional.orElse(null);
	}
	
	public void saveSanPham(SanPham sanPham) {
		sanPhamRepository.save(sanPham);
	}
	
	public void deleteSanPham (Long id) {
		sanPhamRepository.deleteById(id);
	}
	
	

}
