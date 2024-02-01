package java_study;

public class MyCalendar {

	
		public static void main(String[] args) {
			
			new MyCalendar().viewMonth();

		}
		
		public void viewMonth()
		{
			System.out.println("\t\t\t2024년 9월");
			System.out.println("일\t월\t화\t수\t목\t금\t토");
			int space = 1;
			int lastDay= 31;
			
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


