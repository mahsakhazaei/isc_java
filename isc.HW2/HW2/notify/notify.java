package HW2.notify;

public class notify {

	public static void main(String[] args) {
		student s = new student(004400,"noavar","Mahsa",99112);
		s.print_info();
		Manager m = new Manager("Ali",122,"HR Manager");
		m.wakeup();
		Teacher t = new Teacher("Aram",474,"Math");
		t.specialty();
		s.notif();
		m.notif();
		t.notif();
		
		

	}

}
