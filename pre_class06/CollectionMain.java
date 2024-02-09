package class06;

public class CollectionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionMain cm = new CollectionMain();
		cm.testList();

	}
	
	public void testList()
	{
		CollectionTest main = new CollectionTest();
		main.testArrayList();
		
		System.out.println("----------------");
		
		main.testArrayListV2();
	}

}
