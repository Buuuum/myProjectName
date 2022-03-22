package practice.object;

public class HumanEx {

	public static void main(String[] args) {

//		Human h1;
//
//		Human h2 = new Human();
//
//		System.out.println(h2.age);
//		System.out.println(h2);
//		h2.name = "홍길남";
//		h2.age = 19;
//		h2.height = 123.2;
//		System.out.println(h2);
//		
//		Human h3 = new Human("홍길수", 28, 149.3);
//		System.out.println(h3);
		
		
		Human h1 = new Human("홍길동",10,154.4);
		Human h2 = new Human("홍길동",10,154.4);
		Human h3 = h1;
		
		System.out.println(h1==h2);
		System.out.println(h1==h3);
		System.out.println(h1.equals(h2));
		System.out.println(h1.equals(h3));
				

	}
}
