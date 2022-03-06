package practice;

public class Book {
	
	String title;
	int price;
	boolean borrowed;
	
	
	Book(String title, int price, boolean borrowed){
		this.title = title;
		this.price = price;
		this.borrowed = borrowed;
	}
	
	
	
	public String toString(){
		return "["+title+"] "+price+"원, "+"대여중? "+borrowed;
	}
	
	
	public static void main(String[] args) {
		
		Book[] books = new Book[5];
		books[0] = new Book("A", 1000, false); 
		books[1] = new Book("B", 2000, false); 
		books[2] = new Book("C", 3000, true); 
		books[3] = new Book("D", 4000, false); 
		books[4] = new Book("E", 5000, true); 
		
		
		
		System.out.println(books[0].toString());
		System.out.println(books[1].toString());
		System.out.println(books[2].toString());
		System.out.println(books[3].toString());
		System.out.println(books[4].toString());
	}

}
