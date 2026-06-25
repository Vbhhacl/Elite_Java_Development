package Elite_b;

@FunctionalInterface
interface Hello {
    String greet();
    
    default void demo() {
    	System.out.println("HELLOOO DEMO" + temp());
    }
    
    static void test() {
    	System.out.println("HELLOOO TEST");
    }
    
    private String temp() {
    	return "\nHello temp";
    }
}

@FunctionalInterface 
interface Printer{
    void print(String name);
}

public class LambdaDemo {
    public static void main(String[] args) {
        Hello h1 = () -> "Hello, Lambda!";
        System.out.println(h1.greet());
        
        Hello h2 = () -> {
        	String msg = "Bonjour, Lambda !";
        	return msg;
        };
        System.out.println(h2.greet());     
        
        Printer p1 = (name) ->System.out.println(name);
        p1.print("Zubair");
        
        Printer p2 = System.out::println; //method reference 
        p2.print("Amazing");
        
        h1.demo();
        Hello.test();      
        
    }
}