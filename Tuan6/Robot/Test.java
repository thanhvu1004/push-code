package Robot;

public class Test {
	public static void main(String[] args) {
		RobotOto ro = new RobotOto();
		RobotBanhQuy rbq = new RobotBanhQuy();
		
		System.out.println("Automotive Robot:");
		ro.prepare();
		System.out.println("---------------");
		System.out.println("Cookie Robot");
		rbq.prepare();
		
		
	}

}
