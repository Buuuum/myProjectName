package com.human.ex;

import java.util.Scanner;



class User{
	
	public static final int LOGIN_LOG_OFF = 0;
	public static final int LOGIN_NOMAL_USER = 1;
	public static final int LOGIN_ADMIN_USER = 2;

	public int loginState = LOGIN_LOG_OFF;
	public String id = "";
	public String pw = "";
	public int account = 0;

	public User() {	}
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
		
		
		User[] userArray= new User[10];
		int userCount = 0;
		
		userArray[userCount++] = new User(User.LOGIN_NOMAL_USER,"user1","user1",0);
		userArray[userCount++] = new User(User.LOGIN_NOMAL_USER,"user2","user2",0);
		userArray[userCount++] = new User(User.LOGIN_NOMAL_USER,"user3","user3",0);
		userArray[userCount++] = new User(User.LOGIN_NOMAL_USER,"user4","user4",0);
		userArray[userCount++] = new User(User.LOGIN_ADMIN_USER,"admin1","admin1",0);
		userArray[userCount++] = new User(User.LOGIN_ADMIN_USER,"admin2","admin2",0);
		
		for(User i : userArray) {
			System.out.println(i);
		}

		
		String inputId = "";
		String inputPw = "";


		boolean isFlag = true;
		while(isFlag) {
			System.out.println("아이디와 pw를 입력하세요.");
			System.out.println("ID >>");
			inputId = new Scanner(System.in).nextLine();
			System.out.println("PW >>");
			inputPw = new Scanner(System.in).nextLine();
			
			
//			User nowUser = userFind(inputId,userArray);
			User nowUser = null;
			for(int i=0; i<userCount; i++) {
				if(userArray[i].id.equals(inputId)&&userArray[i].pw.equals(inputPw)) {
					nowUser = userArray[i];
				}
			}
			if(nowUser!=null) {
				switch(nowUser.loginState) {
				case User.LOGIN_LOG_OFF:
					System.out.println("로그아웃 상태");
					break;
				case User.LOGIN_NOMAL_USER:
					System.out.println(inputId+"님 로그인 하셨습니다.");
					boolean isNomalFlag = true;
					while(isNomalFlag) {
						System.out.println("1.입금 2.출금 3.잔액확인 4.로그아웃 입력 >>");
						int menu = Integer.parseInt(new Scanner(System.in).nextLine());
						switch (menu) {
						case 1: 
							System.out.println("얼마를 입금하시겠습니까? : ");
							int deposit = Integer.parseInt(new Scanner(System.in).nextLine());
							nowUser.account += deposit;
							System.out.println("잔액 : "+nowUser.account);
							break;
						case 2: 
							System.out.println("얼마를 출금하시겠습니까? : ");
							int withdraw = Integer.parseInt(new Scanner(System.in).nextLine());
							if(nowUser.account>=withdraw) {
								nowUser.account -= withdraw;
								System.out.println("잔액 : "+nowUser.account);
							}else {
								System.out.println("잔액이 부족합니다.");
							}
							break;
						case 3: 
							System.out.println("잔액 : "+nowUser.account);
							break;
						case 4: 
							System.out.println("로그아웃 되었습니다.");
							isNomalFlag = false;
							break;
						default:
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					break;
				case User.LOGIN_ADMIN_USER:
					System.out.println(inputId+"님 로그인 하셨습니다.");
					boolean isAdminFlag = true;
					while(isAdminFlag) {
						System.out.println("1.ID추가 2.ID삭제 3.id변경 4.모든 사용자 출력 0.로그아웃 입력 >>");
						int menu = Integer.parseInt(new Scanner(System.in).nextLine());
						switch (menu) {
						case 1: 
							System.out.println("추가할 ID 입력 >>");
							String fId = new Scanner(System.in).nextLine();
							System.out.println("PW 입력 >>");
							String fPw = new Scanner(System.in).nextLine();
							userArray[userCount++] = new User(User.LOGIN_ADMIN_USER, fId, fPw, 0);
							System.out.println("ID가 추가되었습니다.");
							break;
						case 2: 
							User findUser = null;
							System.out.println("ID 입력 >>");
							fId = new Scanner(System.in).nextLine();
							System.out.println("PW 입력 >>");
							fPw = new Scanner(System.in).nextLine();
							for(int i=0; i<userCount; i++) {
								if(userArray[i].id.equals(fId)&&userArray[i].pw.equals(fPw)) {
									findUser = userArray[i];
									for(int j=i; j<userCount-1; j++) {
										userArray[j] = userArray[j+1];
									}
									userCount--;
									break;
								}
							}
							break;
						case 3: 
							System.out.println("변경 전 ID 입력 >>");
							fId = new Scanner(System.in).nextLine();
							System.out.println("변경 후 ID 입력 >>");
							String newId = new Scanner(System.in).nextLine();
							System.out.println("PW 입력 >>");
							fPw = new Scanner(System.in).nextLine();
							
							for(int i=0; i<userCount; i++) {
								if(userArray[i].id.equals(fId)&&userArray[i].pw.equals(fPw)) {
									userArray[i].id = newId;
									System.out.println("ID가 변경되었습니다.");
								}
							}
							break;
						case 4: 
							for(int i=0; i<userCount; i++) {
								System.out.println("ID : " + userArray[i].id);
							}
							break;
						case 0: 
							System.out.println("로그아웃 되었습니다.");
							isAdminFlag = false;
							break;
						default:
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					break;
				}

			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}


}
