package Elite_b;


class Alfa {

    public Alfa() {
        System.out.println("A constructor");
    }

    public void demo() {
        System.out.println("Alfa demo");
    }
}

class Beta extends Alfa {

    public Beta() {
        System.out.println("B constructor");
    }

    public void test() {
        System.out.println("Beta test");
    }

    @Override
    public void demo() {
        System.out.println("Beta demo");
    }
}

public class TestOverride {

    public static void main(String[] args) {

        Alfa a = new Beta();   // upcasting

        a.demo();              // calls Beta's demo()

        // a.test();           // Not allowed, reference type is Alfa
        
        //Beta ba = (Beta) a;
        
        Beta b = new Beta();
        
        b.test();
        b.demo();
        
        Alfa ab = b; //upcasting (implicit)
        
        ab.demo();
        //ab.test(); //error
        
       // Beta bt = (Beta) ab;
       //down casting (explicit)                         
    }
}
