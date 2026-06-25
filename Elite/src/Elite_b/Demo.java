package Elite_b;

public class Demo<T> {	
	private T data;

	public Demo(T data) {
		super();
		this.data = data;
	}
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public static void main(String[] args) { // polymorphism
		//Demo d1 = new Demo("Hola");
		//System.out.println(d1.getData());
		
		//Demo d2 = new Demo(3.14);
		//System.out.println(d2.getData());
		
		//Demo d3 = new Demo(new Person("Kim",22));
		//System.out.println(d3.getData());		
		
		Demo<String> d1 = new Demo<String>("Holaaa");
		System.out.println(d1.getData());
	}
	
}
