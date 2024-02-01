package class06;

import java.util.ArrayList;

public class CollectionTest {
	
	public void testArrayList()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();  // 제너릭 사용
		
		list.add(new Integer(1));
		//list.add(new String("2"));
		list.add(new Integer(2));
		list.add(new Integer(3));
		
		System.out.println(list.size());
		
		Integer myInt = (Integer)list.get(0); // 제너릭 사용시 (Integer) 사용 안해도 됨
		// int myValue = myInt;
		int value = myInt.intValue();
		System.out.println(value);	
		
		list.set(1, new Integer(2));
		
		for(int i=0;i<list.size();i++)
		{
			Integer myInt2 = (Integer)list.get(i); // 제너릭 사용시 (Integer) 사용 안해도 됨
			int value2 = myInt2.intValue();
			System.out.println(value2);	
		}
		
		Integer removeObject =(Integer)list.remove(1); // 제너릭 사용시 (Integer) 사용 안해도 됨
		System.out.println("삭제 데이터 : " + removeObject.intValue());
		
		System.out.println("삭제 후 전체 조회");
		
		for(int i=0;i<list.size();i++)
		{
			Integer myInt2 = (Integer)list.get(i);
			int value2 = myInt2.intValue();
			System.out.println(value2);	
		}
		
	}
	
	public void testArrayListV2()
	{
		ArrayList<Integer> list = new ArrayList<Integer>();  // 제너릭 사용
		
		list.add(1); //1 //auto boxing 
		//list.add(new String("2"));
		list.add(new Integer(2));
		list.add(3); // auto boxing 
		
		System.out.println(list.size());
		
		int value = list.get(0);
		System.out.println(value);	
		
		list.set(1, new Integer(2));
		
		for(int i=0;i<list.size();i++)
		{
			int value2 = list.get(i);
			System.out.println(value2);	
		}
		
		int value3 = list.remove(1); // auto unboxing
		System.out.println("삭제 데이터 : " + value3);
		
		System.out.println("삭제 후 전체 조회");
		
		for(int i=0;i<list.size();i++)
		{
			int value2 = list.get(i); // auto unboxing
			System.out.println(value2);	
		}
		
	}
}
