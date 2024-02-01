package class06;

import java.util.Date;

public class MyCalendar {

	public void viewMonthIn2024(int year,int month)
	{
		System.out.println("\t\t\t2024년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int[] lastDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		Date date = new Date(year-1900,month-1,1);
		int dateSpace = date.getDay();
		// int febDays= 28;
		if(month==2)
		{
			// 윤년체크
			if((year%4==0 && year%100!=0)||year%400==0)
			{
				lastDays[1]=29;
			}
		}
		
		int space = dateSpace;  
		int lastDay = lastDays[month-1];  
		
		for(int i=0; i<space; i++)
		{
			System.out.print("\t");
		}
		
		for(int i=1;i<= lastDay;i++)
		{
			System.out.print(i+"\t");
			if(((space+i)%7)==0)
			{
				System.out.println("");
			}
		}
		
	}

}
