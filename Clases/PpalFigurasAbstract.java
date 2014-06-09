public class PpalFigurasAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Figura f;
		
		f=new Triangulo(2,2,"Verde");
		System.out.println("Area " + f.area() + f.getColor());
		f=new Circulo(3,"Rojo");
		System.out.println("Area " + f.area() + f.getColor());
		f=new Rectangulo(1,3,"Amarillo");
		System.out.println("Area " + f.area() + f.getColor());
	}

}
