package mmcoe.lib;

public class Member {

	private String name;
	private Bookk bk;

	public Member(String name) {
		this.name = name;
	}

	public void issue(Bookk b) {
		this.bk = b;
	}

	@Override
	public String toString() {
		return name;
	}

	public void status() {
		if (bk == null) {
			System.out.println(name + " has not issued any book");
		} else {
			System.out.println(name + " has issued " + bk);
		}
	}
}