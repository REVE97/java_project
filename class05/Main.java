package class05;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		
		main.start();
		
		main.startPM();
		
	}
	
	public void start()
	{
		Service service = new Service();
		//service.test1();
		//service.test2();
		//service.test3();
		//service.test4();
		//service.test5();
		//service.test6();
	}
	
	public void startPM()
	{
		Source pm = new Source();
		
		//pm.test1();
		pm.test2();
	}

}
