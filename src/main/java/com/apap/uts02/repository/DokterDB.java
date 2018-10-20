package com.apap.uts02.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.apap.uts02.model.DokterModel;


public interface DokterDB extends JpaRepository<DokterModel, Long> {
DokterModel findByNik(String nik);
}

