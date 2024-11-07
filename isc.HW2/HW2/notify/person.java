package HW2.notify;

public abstract class person {
	protected String name;
	protected int ID;
	public person(String name ,int ID) {
	this.name =name;
	this.ID = ID;
	}
	abstract void notif();
	public void wakeup() {
		System.out.println("wakeup");
	}
		
	

}
