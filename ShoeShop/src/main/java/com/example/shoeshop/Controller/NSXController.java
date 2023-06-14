package com.example.shoeshop.Controller;

import com.example.shoeshop.entity.NSX;
import com.example.shoeshop.services.NSXService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("nsx")
public class NSXController {

    @Autowired
    private NSXService nsxService;


    @GetMapping
    public String showNSXList(Model model) {
        List<NSX> nsxs = nsxService.getAllNSX();
        model.addAttribute("nsxs", nsxs);
        return "nsx/list-nsx";
    }

    @GetMapping("/add")
    public String showAddNSXForm(Model model) {
        model.addAttribute("nsx", new NSX());
        return "nsx/add-nsx";
    }

    @PostMapping("/save")
    public String saveNSX(@ModelAttribute("nsx") NSX nsx) {
        nsxService.save(nsx);
        return "redirect:/nsx";
    }

    @GetMapping("/delete/{id}")
    public String deleteNSX(@PathVariable("id") Long id) {
        nsxService.delete(id);
        return "redirect:/nsx";
    }

    @GetMapping("/edit/{id}")
    public String showEditNSXForm(@PathVariable("id") Long id, Model model) {
        NSX nsx = nsxService.getNSXById(id);
        model.addAttribute("nsx", nsx);
        return "nsx/edit-nsx";
    }








}
