package scyberboy.lect02;

public class CoolStudent extends Student {
	
	String haircutStyle = "qka";
	boolean isMyCarClean = true;
	
	@Override
	void goToSchool() {
		if(isMyCarClean) {
			System.out.println("I'm going to school by car with my haircut style " + haircutStyle);
		} else {
			super.goToSchool();
		}
	}
	
	public void setCarCleanness(boolean b) {
		isMyCarClean = b;
	}
	
	public void goToDisko() {
		System.out.println("otivam na disko");
	}

}
