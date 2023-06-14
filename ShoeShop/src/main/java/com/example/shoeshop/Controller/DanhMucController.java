package com.example.shoeshop.Controller;

import com.example.shoeshop.entity.DanhMuc;
import com.example.shoeshop.repository.IDanhMucRepository;
import com.example.shoeshop.services.DanhMucService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("danhmuc")
public class DanhMucController {
    @Autowired
    private DanhMucService danhMucService;


    @GetMapping
    public String showDanhMucList(Model model) {
        List<DanhMuc> danhMucs = danhMucService.getAllDanhMucs();
        model.addAttribute("danhMucs", danhMucs);
        return "danhmuc/list-danhmuc";
    }

    @GetMapping("/add")
    public String showAddDanhMucForm(Model model) {
        model.addAttribute("danhmuc", new DanhMuc());
        return "danhmuc/add-danhmuc";
    }

    @PostMapping("/save")
    public String saveDanhMuc(@ModelAttribute("danhmuc") DanhMuc danhmuc) {
        danhMucService.save(danhmuc);
        return "redirect:/danhmuc";
    }

    @GetMapping("/delete/{id}")
    public String deleteDanhMuc(@PathVariable("id") Long id) {
        danhMucService.delete(id);
        return "redirect:/danhmuc";
    }

    @GetMapping("/edit/{id}")
    public String showEditDanhMucForm(@PathVariable("id") Long id, Model model) {
        DanhMuc danhMuc = danhMucService.getDanhMucById(id);
        model.addAttribute("danhMuc", danhMuc);
        return "danhmuc/edit-danhmuc";
    }

    @PostMapping("/update")
    public String updateDanhMuc(@ModelAttribute("danhMuc") DanhMuc danhMuc) {
        danhMucService.save(danhMuc);
        return "redirect:/danhmuc/list";
    }





}

