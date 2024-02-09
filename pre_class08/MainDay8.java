package class08;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainDay8 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		MainDay8 day8 = new MainDay8();
		day8.test1();

	}
	
	public void test1() throws FileNotFoundException, IOException // try문 사용하여 throws 생략가능
	{
		TestFile tf = new TestFile();
		tf.connectFile();
		
		System.out.println("----------------");
		
		//tf.readFile();
		
		try {
			tf.readFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
