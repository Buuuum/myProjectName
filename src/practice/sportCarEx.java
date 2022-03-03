package practice;

public class sportCarEx {
	public static void main(String[] args) {
		
		sportsCar sc = new sportsCar("Ferari", "Yellow", "Turbo Mode");
		
		System.out.println("Model : "+sc.model);
		System.out.println("Color : "+sc.color);
		System.out.println("Drive Mode : "+sc.mode);
		
		
		sc.powerOn();
		sc.run();
		sc.stop();
		
		sc.driveMode();
		sc.changeMode("Eco Mode");
		sc.PowerOff();
	}

}
