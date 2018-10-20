package com.apap.uts02.service;

import java.util.Optional;

import com.apap.uts02.model.DokterModel;


public interface DokterService {
	DokterModel getDokterDetailByNik(String nik);
	void deleteDokter(DokterModel dokter);


}
