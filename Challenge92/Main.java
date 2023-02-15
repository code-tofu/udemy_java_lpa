package Challenge92;
import java.util.Date;
import java.util.Random;

public class Main {

    public static final int ID_LIMIT = 999999;

    public static void main(String[] args) {
        Date today = new Date();
        Random rand = new Random();


        Employee emp1 = new Employee("Mr Robot", "01-08-1990",
                rand.nextLong(ID_LIMIT), today.toString());
        System.out.println(emp1);
        System.out.println(Long.toString(emp1.getEmployeeID())); //using own method
        System.out.println(Integer.toString(emp1.getAge())); //using parent method

        Employee emp2 = new SalariedEmployee("Mr.Stark", "02-07-1991",
                rand.nextLong(ID_LIMIT), today.toString(), 45000, false);
        System.out.println(emp2);
        System.out.println(Long.toString(emp2.getEmployeeID())); //using parent method
        System.out.println(Integer.toString(emp2.getAge())); //using grandparent method
        System.out.println(emp2.collectPay()); //calling overridden method
        ((SalariedEmployee) emp2).retire(); //calling own method accessing grandparent field
        System.out.println(emp2.collectPay()); //change of state
        System.out.println(emp2);

        Employee emp3 = new HourlyEmployee("Mr.Wayne", "03-06-1992",
                rand.nextLong(ID_LIMIT), today.toString(), 15);
        System.out.println(emp3);
        System.out.println(Long.toString(emp3.getEmployeeID())); //using parent method
        System.out.println(Integer.toString(emp3.getAge())); //using grandparent method
        System.out.println(emp3.collectPay()); //calling overridden method
        ((HourlyEmployee) emp3).OvertimeHoursDone(10); //using setter
        System.out.println(emp3.collectPay()); //calling overridden method
    }
}
