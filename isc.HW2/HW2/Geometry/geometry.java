package HW2.Geometry;

public class geometry {

	public geometry() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		circle c = new circle(2);
		System.out.println(c.Area(c));
		square s = new square(4);
		System.out.println(s.Perimeter(s));
		triangle t = new triangle(3,4,5);
		System.out.println(t.Perimeter(t));
		
	}

}
