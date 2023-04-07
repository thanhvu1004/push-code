package Robot;

public abstract class Robot {
	final void prepare() {
		batdau();
		getLinhKien();
		lapRap();
		kiemTra();
		KetThuc();
	}
	  void batdau() {
		  System.out.println("Starting...");
	}
	abstract void getLinhKien();
	 
	 abstract void lapRap();
	 
     abstract void kiemTra();

	
	  void KetThuc() {
			 System.out.println("Stopping...");
		  }
		
	}
