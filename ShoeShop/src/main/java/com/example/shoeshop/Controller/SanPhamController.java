package com.example.shoeshop.Controller;

import com.example.shoeshop.entity.SanPham;
import com.example.shoeshop.repository.ISanPhamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sanpham")
public class SanPhamController {
    @Autowired
    private ISanPhamRepository sanPhamRepository;

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("sanPham", new SanPham());
        return "sanpham/add-sanpham";
    }

    @PostMapping("/add")
    public String addSanPham(@ModelAttribute("sanPham") SanPham sanPham) {
        sanPhamRepository.save(sanPham);
        return "redirect:/sanpham";
    }

}
