package HW2.Geometry;

public class square implements shape <square> {
	private double d;
	public square(double d ) {
		this.d = d;
	}

	@Override
	public double Area(square s) {
		return s.d*s.d;
	}

	@Override
	public double Perimeter(square s) {
		// TODO Auto-generated method stub
		return s.d*4;
	}

}
