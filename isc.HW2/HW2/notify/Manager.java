package HW2.notify;

public class Manager extends person {
	String position;
	public Manager(String name, int ID,String position) {
		super(name, ID);
		this.position = position;
		// TODO Auto-generated constructor stub
	}

	@Override
	void notif() {
		System.out.println("Email: HI Manager");

	}
	void print_info() {
		System.out.println("name = "+name+ " / ID = "+ this.ID+" / position = "+this.position);
	}

}
