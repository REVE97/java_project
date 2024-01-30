package java_study;

public class MyCalendar {

	
		public void viewMonthIn2024(int month)
		{
			System.out.println("\t\t\t2024년 "+month+"월");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			int[] spaces = {1,4,5,1,3,6,1,4,0,2,5,0}; // 추가
			int[] lastDays = {31,29,31,30,31,30,31,31,30,31,30,31}; // 추가
			
			int space = spaces[month-1];  // 수정
			int lastDay = lastDays[month-1];  // 수정
			
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


