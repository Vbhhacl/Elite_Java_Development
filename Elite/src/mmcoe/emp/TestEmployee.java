package mmcoe.emp;

public class TestEmployee {
	public static void main(String[] args) {
		
		//Employee e = new Employee(1000);
		//System.out.println(e.getSalary());
		
		//Manager m = new Manager(1500,800);
		//System.out.println(m.getSalary());
		
		//Clerk c = new Clerk(1200,400);
		//System.out.println(c.getSalary());
		
		
		//up - casting
		
		//Employee e = m ;
		//System.out.println(e.getSalary());
			
		
		Manager m = new Manager(1500,800);
		Clerk c = new Clerk(1200,400);
		showSalary(m);
		showSalary(c);
	}		
	
	private static void showSalary(Employee e) {
		if (e instanceof Manager)
			System.out.println("manager salary"+ e.getSalary());
		else
			System.out.println("clerk salary"+ e.getSalary());

	}
	
	//method - overloading 
	
	//private static void showSalary(Clerk c) {
	//	System.out.println(c.getSalary());
	//}
	
	//private static void showSalary(Manager m) {
		//	System.out.println(m.getSalary());
		//}
}


