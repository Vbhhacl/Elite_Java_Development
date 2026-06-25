package Elite_b;

public class Subclass<T, P> extends Demo<T> {

    private P value;

    public Subclass(T data, P value) {
        super(data);
        this.value = value;
    }

    public P getValue() {
        return value;
    }

    public void setValue(P value) {
        this.value = value;
    }
    
    public static void main(String[] args) {
    	Subclass<String, Integer> sd = new Subclass<String,Integer>("Mona",99);
    	System.out.println(sd.getData() + "\t" + sd.getValue());
    	
    	Subclass<Integer,Person> s2 = new Subclass<Integer,Person>(101,new Person("Ajay",21));
    	System.out.println(s2.getData() + "\t" + s2.getValue());
    }
}