package com.human.ex;


class Tv {
	
	int channel = 7;
	int volume = 20;
	
	public Tv() {}
	
	public Tv(int channel, int volume) {
		super();
		this.channel = channel;
		this.volume = volume;
	}

	@Override
	public String toString() {
		return "Tv [channel=" + channel + ", volume=" + volume + "]";
	}
	
	
	void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	void nowChannel() {
		System.out.println(String.format("현재 채널은 %d번 소리는 %d입니다.", channel, volume));	
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println(channel + "번을 틀었습니다.");
	}
	void volUp(int volume) {
		this.volume += volume;
		System.out.println("소리 " + volume + "을 올립니다.");
	}
	void volDown(int volume) {
		this.volume -= volume;
		System.out.println("소리 " + volume + "을 내립니다.");
	}
	
}




public class Java0331_Ex02 {
	
	public static void main(String[] args) {

		Tv tv = new Tv();
		tv.nowChannel();
		tv.changeChannel(10);
		tv.volUp(10);
		tv.nowChannel();
		
	}

}
