package HW2.Geometry;

public class circle implements shape <circle> {

	private double r;
	public circle(double r ) {
		this.r = r;
	}

	@Override
	public double Area(circle c) {
		return c.r*c.r* Math.PI;
	}

	@Override
	public double Perimeter(circle c) {
		// TODO Auto-generated method stub
		return 	c.r*2*Math.PI;
	}
	}


