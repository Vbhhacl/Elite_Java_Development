package mmcoe.lib;

public class Bookk {

    private String title;
    private Member mbr;

    public Bookk(String title) {
        this.title = title;
    }

    public void issueTo(Member m) {
        this.mbr = m;
    }

    @Override
    public String toString() {
        return "Book [Name=" + title + "]";
    }

    public void status() {
        if (mbr == null) {
            System.out.println(title + " not issued to anyone");
        } else {
            System.out.println(title + " issued to " + mbr);
        }
    }
}