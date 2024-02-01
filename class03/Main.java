package java_study;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Main main = new Main();
		//main.test1();
		main.test2();
	}
	
	public void test1() // 모든 달 출력
	{
		MyCalendar cal = new MyCalendar();
		
		for (int i = 0;i<12;i++) 
		{
			cal.viewMonthIn2024(i+1);
			System.out.println("\n");
		}
	}
	
	public void test2() // 원하는 달 입력 
	{
		while(true) {
			
		MyCalendar cal = new MyCalendar();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Month 입력: ");
		String month = scan.nextLine();
		
		int monthInt = Integer.parseInt(month);
		
		cal.viewMonthIn2024(monthInt);
		
		System.out.println("");
		
		
		}
		
	}

}
