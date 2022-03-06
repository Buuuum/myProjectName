package practice;

public class Professor {
	
	String name;
	String member;
	String credit;
		
	Professor(String name, String member, String credit){
		this.name = name;
		this.member = member;
		this.credit = credit;
	}
	
	void attendance() {System.out.println(name + "의 출석을 확인했습니다.");}
	void assignment() {System.out.println(member + " 과제를 냈습니다.");}
	void givecredit() {System.out.println(credit + "학점을 주었습니다.");}
	

	public static void main(String[] args) {
		
		Professor professor = new Professor("홍길동", "행정학과", "A");
		
		
		professor.attendance();
		professor.assignment();
		professor.givecredit();
		
		
	}
}
