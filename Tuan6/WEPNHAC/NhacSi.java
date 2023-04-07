package WEPNHAC;

import java.util.List;

public class NhacSi extends NgheSi {
	List<BaiHat> listBaiHat;

	public NhacSi(int name, List<BaiHat> listBaiHat) {
		super(name);
		this.listBaiHat = listBaiHat;
	}
	public boolean checkNameNgheSi(String name) {
		return name.equals(this.name);
	}
	

}
