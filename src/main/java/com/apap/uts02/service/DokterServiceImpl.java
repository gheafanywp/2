package com.apap.uts02.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.*;

import com.apap.uts02.model.DokterModel;
import com.apap.uts02.repository.DokterDB;

@Service
@Transactional
public class DokterServiceImpl implements DokterService {
	@Autowired
	private DokterDB dokterDB;

//	@Override
//	public void addJabatan(JabatanModel jabatan) {
//		// TODO Auto-generated method stub
//		jabatanDB.save(jabatan);
//	}

	
	@Override
	public DokterModel getDokterDetailByNik(String nik){
		return dokterDB.findByNik(nik);
	}

	@Override
	public void deleteDokter( DokterModel dokter) {
		dokterDB.deleteById(dokter.getId());
	}

	

}