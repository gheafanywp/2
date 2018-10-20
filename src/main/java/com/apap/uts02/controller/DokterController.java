package com.apap.uts02.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apap.uts02.model.DokterModel;
import com.apap.uts02.service.DokterService;


@Controller
public class DokterController {
	
	@Autowired
	private DokterService dokterService;
	
	@RequestMapping("/")
	private String index(Model model) {
		return "index"; 
	}
	
	@RequestMapping("/test")
	private String test(Model model) {
		return "index"; 
	}
	
	@RequestMapping(value = "/dokter/{nik}",method = RequestMethod.GET)
    private String viewDokter(@PathVariable(value="nik") String nik, Model model) {
        System.out.println("TESTTTttttttt");
		DokterModel dokter = dokterService.getDokterDetailByNik(nik);
        model.addAttribute("dokter", dokter);
        return "view-dokter";
	}
	
	@RequestMapping(value="/dokter/tambah",method=RequestMethod.GET)
	private String add(Model model) {
		model.addAttribute("dokter",new DokterModel());
		return "add-dokter";
	}
	
	@RequestMapping(value="/dokter/tambah",method=RequestMethod.POST)
	private String addDokter(@ModelAttribute DokterModel dokter) {
		dokterService.addDokter(dokter);
		return "add";
	}

}
