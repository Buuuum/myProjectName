package com.human.ex;

import java.util.Scanner;



class User{

	public static final int LOGIN_LOG_OFF = 0;
	public static final int LOGIN_NOMAL_USER = 1;
	public static final int LOGIN_ADMIN_USER = 2;


	public static int loginState = LOGIN_LOG_OFF;
	public static String id = "admin";
	public static String pw = "admin";
	public static int account = 0;


	public User() {	}
	public User(int loginState, String id, String pw) {
		super();
		this.loginState = loginState;
		this.id = id;
		this.pw = pw;
	}
	public User(int loginState, String id, String pw, int account) {
		super();
		this.loginState = loginState;
		this.id = id;
		this.pw = pw;
		this.account = account;
	}

	@Override
	public String toString() {
		return "User [loginState=" + loginState + ", id=" + id + ", pw=" + pw + ", account=" + account + "]";
	}

}





public class BankProject {

	public static void main(String[] args) {

		User[] userArray= new User[5];
		int userCount = 0;
		
		userArray[userCount++] = new User(User.LOGIN_NOMAL_USER, "user1", "user1", 0);
		userArray[userCount++] = new User(User.LOGIN_NOMAL_USER, "user2", "user2", 0);
		userArray[userCount++] = new User(User.LOGIN_NOMAL_USER, "user3", "user3", 0);
		userArray[userCount++] = new User(User.LOGIN_ADMIN_USER, "admin1", "admin1");
		userArray[userCount++] = new User(User.LOGIN_ADMIN_USER, "admin2", "admin2");

		
		String inputId = "";
		String inputPw = "";


		boolean isFlag = true;
		while(isFlag) {
			System.out.println("아이디와 pw를 입력하세요.");
			System.out.println("ID >>");
			inputId = new Scanner(System.in).nextLine();
			System.out.println("PW >>");
			inputPw = new Scanner(System.in).nextLine();
			
			
			User nowUser = userFind(inputId,userArray);



			if(nowUser!=null) {
				switch(nowUser.loginState) {
				case User.LOGIN_LOG_OFF:
					System.out.println("사용할 수 없는 ID입니다.");
					break;
				case User.LOGIN_NOMAL_USER:
					System.out.println(User.id+"님 로그인 하셨습니다.");
					System.out.println("1.입금 2.출금 3.확인 4.종료 입력 >>");
					break;
				case User.LOGIN_ADMIN_USER:
					System.out.println(User.id+"님 로그인 하셨습니다.");
					System.out.println("1.계정추가 2.계정삭제 3.id변경 4.모든 사용자 출력 6.종료 입력 >>");
					break;
				}

			}else {
				
			}
		}
	}

	private static User userFind(String inputId, User[] userArray) {
		// TODO Auto-generated method stub
		return null;
	}

}
