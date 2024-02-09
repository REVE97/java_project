package class08;

import java.util.Comparator;

public class GisaComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int result = o2.getTotal()-o1.getTotal();
		return result;
	}

}
