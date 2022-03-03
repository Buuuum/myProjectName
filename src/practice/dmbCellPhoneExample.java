package practice;

public class dmbCellPhoneExample {
	public static void main(String[] args) {
		
		dmbCellPhone dmbCellPhone = new dmbCellPhone("아이폰", "스페이스그레이", 10);
		
		
		System.out.println("모델 : " + dmbCellPhone.model);
		System.out.println("색상 : " + dmbCellPhone.color);
		
		System.out.println("채널 : " + dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요?");
		dmbCellPhone.receiveVoice("안녕 반가워");
		dmbCellPhone.sendVoice("그래 안녕");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmB(30);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
		
		dmbCellPhone.turnOnDmb();
	}
}
