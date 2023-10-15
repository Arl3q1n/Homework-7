import exercises.*;

public class Main
{
	public static void main(String[] args) {
	    
	    // Exercise 1
		System.out.println("\n---------------------------\n");

	    Employee Ex_1 = new Employee("Andrei", "Manager", 18);
	    Ex_1.displayInformation();
	    
	    // Exercise 2
		System.out.println("\n--------------------------\n");

	    Invoice Ex_2 = new Invoice("Lenovo ThinkPan X1", "TOP 1 Laptop", 1500, 2);
	    Ex_2.getAmount();
	    
	    //Exercise 3
		System.out.println("\n--------------------------\n");

	    Date Ex_3 = new Date(15, 10, 2023);
		Ex_3.displayDate();
	}
}
