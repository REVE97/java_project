package class05;

import java.util.Arrays;
import java.util.Scanner;

public class Source {
	
	public void test1()
	{
		// 논리 연산 &&, ||
		// 윤년 판단
		// 4로 나누어 떨어지고 100으로 나누어 떨어지면 안된다.
		// 도는 400으로 나누어 떨어져야 한다
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("year: ");
		int year = scan.nextInt();
		
		if((year%4==0 && year%100!=0)||year%400==0)
		{
			System.out.println("이번년도는 윤년입니다.");
		}
		else
		{
			System.out.println("이번년도는 윤년이 아닙니다.");
		}
	}
	
	public void test2()
	{
		String data1 = "990001,addx, 17, 29, 16, 49, 43,154,C,A,C";
		String data2 = "990002,stch, 30,  9, 48, 25, 81,193,C,A,A";
		String data3 = "990003,gali, 93, 60,  6, 84, 36,279,A,C,A";
		
		// 위의 3명의 학생정보를 2중배열을 이용하여 저장하는 코드를 작성하시오.
		// 학번,이메일,국어,영어,수학 점수만 저장한다.
		
		String[][] students = new String[3][5];
		String[] temp1 = data1.split(",");
		String[] temp2 = data2.split(",");
		String[] temp3 = data3.split(",");
		String[][] temps = {temp1,temp2,temp3};
		
		for(int i =0;i<3;i++)
		{
			for(int j=0;j<5;j++)
			{
				students[i][j] = temps[i][j];	
			}
		
			System.out.println(Arrays.toString(students[i]));
		}
		
	}
	
	public void test3()
	{
		// Date, Calendar 객체 생성
		// 년, 월, 일 ,시 , 분 ,초 요일정보 출력하시오
		
	}

}
