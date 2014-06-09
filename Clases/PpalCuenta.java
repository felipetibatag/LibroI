import java.util.Scanner;


public class PpalCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int opc=0;
		Cuenta c=null;
		
		
		do {
			System.out.println("1. Crear cuenta vacía");
			System.out.println("2. Crear cuenta saldo inicial");
			System.out.println("3. Ingresar Dinero");
			System.out.println("4. Sacar Dinero");
			System.out.println("5. Ver Saldo");
			System.out.println("6. Salir");
			
			
			opc=in.nextInt();	
			
			
				switch (opc) {
				case 1:
					c=new Cuenta();
					break;
				case 2:
					System.out.print("Ingrese saldo inicial : ");
					c=new Cuenta(in.nextFloat());
				case 3:
					if(c!=null){
						System.out.println("Ingrese cantidad :");
						c.ingresar(in.nextFloat());
					}else{
						System.out.println("Primero se debe crear la cuenta");
					}
					break;
					
				case 4:
					if(c!=null){
						System.out.println("Cantidad a retirar : ");
					try{
						c.extraer(in.nextFloat());
					}catch(CuentaException e){
						System.out.println(e.getMessage());
					}
					}else{
						System.out.println("Primero se debe crear la cuenta");
						
					}
					break;
				case 5:
					if(c!=null){
						System.out.printf("Saldo %f\n",c.getSaldo());
					}else{
						System.out.println("Primero se debe crear la cuenta");
						
					}
					break;
					
				case 6:
					System.exit(0);
				}
				
		} while (opc!=6);
		
	}

}
