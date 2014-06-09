public class Circulo extends Figura{
	private double r;
	public Circulo(double r, String c) {
		// TODO Auto-generated constructor stub
		super(c);
		this.r=r;
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI*r*r;
	}

}
