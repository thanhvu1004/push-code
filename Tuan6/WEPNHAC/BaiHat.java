package WEPNHAC;

import java.util.ArrayList;
import java.util.List;

public class BaiHat {
	private int tenBaiHat;
	private NhacSi nhacSi;
	private String theLoai;
	private String duongDan;
	private int soLanTruyCap;
	public BaiHat(int tenBaiHat, NhacSi nhacSi, String theLoai, String duongDan, int soLanTruyCap) {
		super();
		this.tenBaiHat = tenBaiHat;
		this.nhacSi = nhacSi;
		this.theLoai = theLoai;
		this.duongDan = duongDan;
		this.soLanTruyCap = soLanTruyCap;
	
	}
	public int getTenBaiHat() {
		return tenBaiHat;
	}
	public void setTenBaiHat(int tenBaiHat) {
		this.tenBaiHat = tenBaiHat;
	}
	public NhacSi getNhacSi() {
		return nhacSi;
	}
	public void setNhacSi(NhacSi nhacSi) {
		this.nhacSi = nhacSi;
	}
	public String getTheLoai() {
		return theLoai;
	}
	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}
	public String getDuongDan() {
		return duongDan;
	}
	public void setDuongDan(String duongDan) {
		this.duongDan = duongDan;
	}
	public int getSoLanTruyCap() {
		return soLanTruyCap;
	}
	public void setSoLanTruyCap(int soLanTruyCap) {
		this.soLanTruyCap = soLanTruyCap;
	
	}
	public boolean checkTheLoai(String theLoai) {
		return this.theLoai.equals(theLoai);	
		}
		
	}
	
