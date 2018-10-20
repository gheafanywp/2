package com.apap.uts02.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.apap.uts02.model.DokterModel;
import com.apap.uts02.service.DokterService;



public class DokterController {
	
	@Autowired
	private DokterService dokterService;
	
	@RequestMapping("/")
	private String index(Model model) {
		return "index"; 
	}
	
	@RequestMapping(value = "/dokter", method = RequestMethod.GET)
    private String viewDokter(@PathVariable(value="nik") String nik, Model model) {
        System.out.println("TESTTTttttttt");
		DokterModel dokter = dokterService.getDokterDetailByNik(nik);
        model.addAttribute("dokter", dokter);
        return "view-dokter";
	}


}
