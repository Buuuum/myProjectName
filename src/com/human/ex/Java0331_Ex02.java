package com.human.ex;


class Tv {
	
	public int channel = 7;
	public int volume = 20;
	
	public Tv() {}
	
	public Tv(int channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}

	
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	public void nowChannel() {
		System.out.println(String.format("현재 채널은 %d번 소리는 %d입니다.", channel, volume));	
	}
	public void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "번을 틀었습니다.");
	}
	public void volUp(int volume) {
		this.volume += volume;
		System.out.println("소리 " + volume + "을 올립니다.");
	}
	public void volDown(int volume) {
		this.volume -= volume;
		System.out.println("소리 " + volume + "을 내립니다.");
	}
	
}




class AutoGear {
	
	private int speed;
	private String gear;
	
	public AutoGear() {}

	public AutoGear(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public String setSpeed(int speed) {
		if(speed>=40) {
			this.gear = "4단계";
		}else if(speed>=30) {
			this.gear = "3단계";
		}else if(speed>=20) {
			this.gear = "2단계";
		}else if(speed>0) {
			this.gear = "1단계";
		}
		this.speed = speed;
		return "속도 : "+speed+" 기어 : "+gear;
	}
	
	public String getGear() {
		if(speed>=40) {
			this.gear = "4단계";
		}else if(speed>=30) {
			this.gear = "3단계";
		}else if(speed>=20) {
			this.gear = "2단계";
		}else if(speed>0) {
			this.gear = "1단계";
		}
		return gear;
	}
	
//	public int speedUp() {
//		this.speed += 10;
//		return speed;
//	}
//	
//	public int speedDown() {
//		this.speed -= 10;
//		return speed;
//	}

	@Override
	public String toString() {
		return "autoGear [speed=" + this.speed + ", gear=" + this.gear + "]";
	}
	
	
}



public class Java0331_Ex02 {
	
	public static void main(String[] args) {

//		Tv tv = new Tv();
//		tv.turnOn();
//		tv.nowChannel();
//		tv.changeChannel(10);
//		tv.volUp(10);
//		tv.nowChannel();
//		tv.turnOff();
//		tv.toString();
		
		
		AutoGear auto = new AutoGear(10);
		System.out.println(auto.getSpeed());
//		System.out.println(auto.speedUp());
		System.out.println(auto.getGear());
		System.out.println(auto.setSpeed(33));
		
		
	}

}
