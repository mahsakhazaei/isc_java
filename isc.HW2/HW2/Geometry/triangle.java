package HW2.Geometry;

public class triangle implements shape<triangle> {
	private double a;
	private double b;
	private double c;
	public triangle(double a,double b,double c) {
		this.a = a;
		this.b = b;
		this.c = c;
		// TODO Auto-generated constructor stub
	}
	@Override
	public double Area(triangle t ) {
		double s = (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	}

	@Override
	public double Perimeter(triangle t) {
		// TODO Auto-generated method stub
		return a+b+c;
	}

}
