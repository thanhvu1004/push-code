package WEPNHAC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class AlbumNhac  {
	private String tuaDe;
	private Date datePhatHanh;
	private String hangPhatHanh;
	private List<AlbumItem> albumItem;
	public AlbumNhac(String tuaDe, Date datePhatHanh, String hangPhatHanh, List<AlbumItem> albumItem) {
		super();
		this.tuaDe = tuaDe;
		this.datePhatHanh = datePhatHanh;
		this.hangPhatHanh = hangPhatHanh;
		this.albumItem = albumItem;
	}
	public List<BaiHat> TimKiemTheoTenCaSi(String name) {
		List<BaiHat> listBaiHat = new ArrayList<>();
		for (AlbumItem abi : albumItem) {
			if (abi.getCaSiAlbum().checkName(name) ) {
				listBaiHat.add(abi.getBaiHatAblum());	
			}	
		}
		return listBaiHat;
		}
	public List<BaiHat> TimKiemTheoTenNhacSi(String name) {
		List<BaiHat> listBaiHat = new ArrayList<>();
		for (AlbumItem abi : albumItem) {
			if (abi.getBaiHatAblum().getNhacSi().checkName(name)) {
				listBaiHat.add(abi.getBaiHatAblum());
			}
		}
		return listBaiHat;
		}
	public List<BaiHat> TimKiemTheoTheLoai(String theLoai) {
		List<BaiHat> listBaiHat = new ArrayList<>();
		for (AlbumItem abi : albumItem) {
		if (abi.getBaiHatAblum().getTheLoai().equals(theLoai)) {
			listBaiHat.add(abi.getBaiHatAblum());
			}
		}
		return listBaiHat;
		}
	public List<BaiHat> LietKe10BanNhac() {
		List<BaiHat> list10BaiHat = new ArrayList<>();
		List<BaiHat> listAll = new ArrayList<>();
		for (AlbumItem abi : albumItem) {
			listAll.add(abi.getBaiHatAblum());
			
		}
		Collections.sort(listAll, new Comparator<BaiHat>() {

			@Override
			public int compare(BaiHat o1, BaiHat o2) {
				return o2.getSoLanTruyCap()-o1.getSoLanTruyCap();	
			}
		});
		for (int i = 0; i < 10; i++) {
			list10BaiHat.add(listAll.get(i));

		}
		return list10BaiHat;
	}
	public void sysoutBaiHat(List<BaiHat> listBaiHat) {
		for (BaiHat baiHat : listBaiHat) {
			System.out.println("Ten Bai Hat" + baiHat.getTenBaiHat() + "," + "Ten Nhac Si" + baiHat.getNhacSi() + "The Loai" + baiHat.getTheLoai() );			
		}
	}
	}