package mmcoe.lib;

public class TestLibrary {

    public static void main(String[] args) {

        Bookk b1 = new Bookk("The Alchemist");
        Bookk b2 = new Bookk("Kite Runner");

        Member m1 = new Member("Vaibhavi");
        Member m2 = new Member("Sam");

        // Issue books to members
        b1.issueTo(m1);
        m1.issue(b1);

        b2.issueTo(m2);
        m2.issue(b2);

        // Print status
        b1.status();
        b2.status();

        m1.status();
        m2.status();
    }
}