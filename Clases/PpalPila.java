
public class PpalPila {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pila <Integer> Pnumeros=new Pila<Integer>();
		Pila <String> Pcadenas=new Pila<String>();
		
		Pnumeros.agregar(1);
		Pnumeros.agregar(2);
		Pnumeros.agregar(3);
		Pnumeros.agregar(4);
		Pnumeros.agregar(5);
		System.out.println("Tamaño Pila Numeros antes de eliminar"  + Pnumeros.total());
		
		Pcadenas.agregar("a");
		Pcadenas.agregar("b");
		Pcadenas.agregar("c");
		System.out.println("Tamaño Pila Cadenas antes de eliminar "  + Pcadenas.total());
		Pcadenas.quitar();
		System.out.println("Tamaño Pila Cadenas después de eliminar "  + Pcadenas.total());
		
		System.out.println(Pnumeros.obtener(2));//imprime 3
		String a=new String("pepito");
		String b=a;
		
		if (a==b) {
			System.out.println("Iguales");
		}else{
			System.out.println("Diferentes");
		}
			
				
	}

}
