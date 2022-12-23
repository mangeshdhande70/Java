package Employee;

import java.util.Comparator;

public class MyComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Employee emp1 = (Employee) o1;
        Employee emp2 = (Employee) o2;

        Long l1 = emp1.getEmployeeId();
        Long l2 = emp2.getEmployeeId();

        return l1.compareTo(l2) ;
    }
}
