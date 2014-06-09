public class Rectangulo extends Figura{
	private double l1,l2; 
	public Rectangulo(double l1, double l2, String c) {
		// TODO Auto-generated constructor stub
		super(c);
		this.l1=l1;
		this.l2=l2;
	}
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return l1*l1+l2*l2;
	}

}
