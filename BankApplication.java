package org.swstudy.java;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		String[] Account = new String[100];
		
		Scanner scanner = new Scanner(System.in); 
		Account account = new Account();
		
		System.out.println("------------------------------------------");
		System.out.println("1.계좌생성 . 2.계좌목록 . 3.예금 . 4.출금 . 5.종료");
		System.out.println("------------------------------------------");
		
		System.out.print("선택> ");
		String select = scanner.nextLine();
		
		if(select=="1")
		{
			System.out.print("계좌번호: ");
			account.accountNumber= scanner.nextLine();
			System.out.print("계좌주: ");
			account.name= scanner.nextLine();
			System.out.print("계좌주: ");
			// account.money = scanner.nextLine(); // 수정 필요
		}
		
		
		
	}

}
