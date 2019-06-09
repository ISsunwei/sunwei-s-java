package Test5;

import java.util.Comparator;

public class StudentComp implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		if (o1.getId() != o2.getId()) {
            return o1.getId() > o2.getId() ? 1 : -1;
        }
        return 0;
	}
	
}
