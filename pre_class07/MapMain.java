package class07;

public class MapMain {

	public static void main(String[] args) {
		
		MapMain main = new MapMain();
		main.test();
		
		System.out.println("------------------");
		
		main.testCal();

	}
	
	public void testCal()
	{
		TestCalendar ct = new TestCalendar();
		ct.test1();
		
		System.out.println("---------------");
		
		ct.test2();
		
		System.out.println("---------------");
		
		ct.test3();
		
		System.out.println("---------------");
		
		String full = ct.getDateTimeInfo(TestCalendar.FULL_DATE_TIME);
		String date = ct.getDateTimeInfo(TestCalendar.DATE_ONLY);
		String time = ct.getDateTimeInfo(TestCalendar.TIME_ONLY);
		System.out.println(full + "\n"+date+"\n"+time);
		
		System.out.println("---------------");
		
		String full2 = ct.getDateTimeInfoV2(DateTimeInfo.FULL_DATE_TIME);
		String date2 = ct.getDateTimeInfoV2(DateTimeInfo.DATE_ONLY);
		String time2 = ct.getDateTimeInfoV2(DateTimeInfo.TIME_ONLY);
		System.out.println(full2 + "\n"+date2+"\n"+time2);
	}
	
	public void test()
	{
		MapTest test = new MapTest();
		test.test1();
	}

}
