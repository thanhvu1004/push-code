package WEPNHAC;

import java.util.List;

public class AlbumItem {
	BaiHat baiHatAblum;
	CaSi caSiAlbum;
	public AlbumItem(BaiHat baiHatAblum, CaSi caSiAlbum) {
		super();
		this.baiHatAblum = baiHatAblum;
		this.caSiAlbum = caSiAlbum;
	}
	public BaiHat getBaiHatAblum() {
		return baiHatAblum;
	}
	public void setBaiHatAblum(BaiHat baiHatAblum) {
		this.baiHatAblum = baiHatAblum;
	}
	public CaSi getCaSiAlbum() {
		return caSiAlbum;
	}
	public void setCaSiAlbum(CaSi caSiAlbum) {
		this.caSiAlbum = caSiAlbum;
	}
	public boolean checkNhacSi(String name) {
		return this.baiHatAblum.getNhacSi().equals(name);
		
	}
	public boolean checkTheLoai(String theLoai) {
		return this.getBaiHatAblum().getTheLoai().equals(theLoai);
		
	}
	

}
