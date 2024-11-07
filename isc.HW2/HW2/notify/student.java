package HW2.notify;
public class student extends person {
	private int snum;
	private String school;
	student(int snum,String school,String name,int ID){
		super(name,ID);
		this.snum = snum;
		this.school = school;
	}
	@Override
	void notif() {
		System.out.println("SMS: HI student");
	}
	void print_info() {
		System.out.println("name = "+name+ " / ID = "+ this.ID+" / school = "+this.school + " /studetn number = "+ this.snum);
	}
	
}
