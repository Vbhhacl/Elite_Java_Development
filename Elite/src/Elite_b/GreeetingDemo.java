package Elite_b;

interface Greeting{
	void sayHello();
}

public class GreeetingDemo {
	class GreetingInnerImpl implements Greeting {
		@Override 
		public void sayHello() {
			System.out.println("Greeting Inner Impl");
			
		}
	}
	public void anotherDemo() {
		class GreetingNestedImpl implements Greeting{
			@Override 
			public void sayHello() {
				System.out.println("Greeting Nested Impl");
			}
		};
		new GreetingNestedImpl().sayHello();
		
	}
	
	public static void main(String[] args) {
		GreeetingDemo demo = new GreeetingDemo();
		Greeting g1 = demo.new GreetingInnerImpl();
		g1.sayHello();
		
		demo.anotherDemo();
		
		Greeting g = new Greeting() {
			
			@Override
			public void sayHello() {
				System.out.println("Greeting from anonymous inner class");
				
			}
		};
		g.sayHello();
		
		
		Greeting greet = () -> System.out.println("Greeting from lambda"); // lambda expression
		greet.sayHello();
		}
		
}
