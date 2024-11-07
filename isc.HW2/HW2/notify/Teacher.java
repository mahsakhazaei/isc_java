package HW2.notify;

public class Teacher extends person {
	String spec;
	public Teacher(String name, int ID, String spec) {		
		super(name, ID);
		this.spec = spec;
		// TODO Auto-generated constructor stub
	}

	@Override
	void notif() {
		System.out.println("Call: HI Teacher");

	}
	void specialty() {
		System.out.println("I am "+this.spec+" teacher.");
	}

}
