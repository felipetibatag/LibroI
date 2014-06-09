public class Triangulo extends Figura {
	private double b,h;
	
	public Triangulo(double b, double h,String c){
		super(c);
		this.b=b;
		this.h=h;
		
	}
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (b*h)/2;
	}
}
