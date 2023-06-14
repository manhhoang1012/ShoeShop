package com.example.shoeshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.shoeshop.entity.DanhMuc;
import com.example.shoeshop.repository.IDanhMucRepository;



@Service
public class DanhMucService {
	@Autowired
	private IDanhMucRepository danhMucRepository;
	
	public List<DanhMuc> getAllDanhMucs(){
		return danhMucRepository.findAll();
	}
	
	public DanhMuc getDanhMucById(Long id) {
		Optional<DanhMuc> optional = danhMucRepository.findById(id);
		return optional.orElse(null);
	}
	
	public void save(DanhMuc danhMuc) {
		danhMucRepository.save(danhMuc);
	}
	
	public void delete (Long id) {
		danhMucRepository.deleteById(id);
	}

}
