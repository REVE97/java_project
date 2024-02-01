package class05;

public class Service {
	
	public void test1()
	{
		System.out.println("Test");
	}
	
	public void test2()
	{
		// 아래 문자열중 가장 마지막에 있는 문자를 추출하는 코드를 작성하시오.
		String data1 = "990001addx 17 29 16 49 43154CAC";
		String temp = data1.substring(30);
		
		System.out.println(temp);
		
		char temp2 = data1.charAt(data1.length()-1);
		System.out.println(temp2);
	}
	
	public void test3()
	{
		int number = 123456;
		// 위의 숫자를 뒤에서 부터 하나씩 분리하여 출력하고 합계를 구하시오.
		int sum=0;
		
		for(int i=0;i<6;i++)
		{
			int splitnumber = number % 10;
			System.out.println(splitnumber);
			number = number / 10;
			
			sum+=splitnumber;
		}
		
		System.out.println("sum: "+sum);
	}
	
	public void test4()
	{
		int number = 1234567;
		// 위의 숫자를 뒤에서 부터 하나씩 분리하여 출력하고 합계를 구하시오.
		int sum=0;
		
		while(true)
		{
			int splitnumber = number % 10;
			System.out.println(splitnumber);
			number = number / 10;
			
			sum+=splitnumber;
			
			if(number==0)
			{
				break;
			}
		}
		
		System.out.println("sum: "+sum);
	}
	
	public void test5()
	{
		String number = "12345";
		int sum = 0;
		
		for(int i=0;i<number.length();i++)
		{
			String temp = number.substring(i,i+1);
			System.out.println(temp);
			sum+=Integer.parseInt(temp);
		}
		
		System.out.println("sum: "+sum);
	}
	
	public void test6()
	{
		String number = "12345";
		int sum = 0;
		
		for(int i=0;i<number.length();i++)
		{
			char temp = number.charAt(i);
			System.out.println(temp);
			sum+=Integer.parseInt(String.valueOf(temp));    // valueOf() 사용
		}
		
		System.out.println("sum: "+sum);
	}

}
