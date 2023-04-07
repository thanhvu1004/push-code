package WEPNHAC;

public abstract class NgheSi {
	protected int name;

	public NgheSi(int name) {
		super();
		this.name = name;
	}
	public boolean checkName(String ngheSi) {
		return ngheSi.equals(this.name);
	}
	

}
