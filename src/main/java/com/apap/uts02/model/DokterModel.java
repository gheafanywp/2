package com.apap.uts02.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "dokter")
public class DokterModel implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 16)
	@NotNull
	@Column(name = "nik", nullable = false)
	private String nik;
	
	@NotNull
	@Size(max = 50)
	@Column(name = "nama_dokter", nullable = false)
	private String nama_dokter;
	
	@NotNull
	@Column(name = "jenis_kelamin", nullable = false)
	private Integer jenis_kelamin;
	
	@NotNull
	@Column(name = "tanggal_lahir")
	private Date tanggal_lahir;
	
	
	@Size(max = 100)
	@Column(name = "alamat_dokter", nullable = true)
	private String alamat_dokter;
	
	
	@Size(max = 20)
	@Column(name = "no_hp", nullable = true)
	private String no_hp;
	
	@Size(max = 50)
	@Column(name = "spesialisasi", nullable = true)
	private String spesialisasi;
	
	@NotNull
	@Column(name = "status", nullable = false)
	private Integer status;
	
	

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getNama_dokter() {
		return nama_dokter;
	}

	public void setNama_dokter(String nama_dokter) {
		this.nama_dokter = nama_dokter;
	}

	public Integer getJenis_kelamin() {
		return jenis_kelamin;
	}

	public void setJenis_kelamin(Integer jenis_kelamin) {
		this.jenis_kelamin = jenis_kelamin;
	}

	public Date getTanggal_lahir() {
		return tanggal_lahir;
	}

	public void setTanggal_lahir(Date tanggal_lahir) {
		this.tanggal_lahir = tanggal_lahir;
	}

	public String getAlamat_dokter() {
		return alamat_dokter;
	}

	public void setAlamat_dokter(String alamat_dokter) {
		this.alamat_dokter = alamat_dokter;
	}

	public String getNo_hp() {
		return no_hp;
	}

	public void setNo_hp(String no_hp) {
		this.no_hp = no_hp;
	}

	public String getSpesialisasi() {
		return spesialisasi;
	}

	public void setSpesialisasi(String spesialisasi) {
		this.spesialisasi = spesialisasi;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public int getJumlahPegawai (int jumlahPegawai) {
		return jumlahPegawai;
	}

	
}

