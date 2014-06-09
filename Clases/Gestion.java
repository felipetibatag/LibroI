import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Gestion {
	public static void main(String[] args) throws IOException {
		ArrayList temperaturas=new ArrayList();
		String opcion;
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		do{
			System.out.println("Elegir opcion:\n");
			System.out.println("1.Añadir Temperatura");
			System.out.println("2.Mostrar Temperatura Media");
			System.out.println("3.Mostrar Temperaturas Extremas");
			System.out.println("4.Salir");
			opcion=bf.readLine();
			
			switch (Integer.parseInt(opcion)) {
			case 1:
				double temp;
				System.out.println("Introduce la temperatura: ");
				temp=Double.parseDouble(bf.readLine());
				almacenaTemperatura(temp,temperaturas);
				break;
			case 2:
				muestraMedia(temperaturas);
				break;
			case 3:
				muestraExtremas(temperaturas);
			default:
				break;
			}
		}while(!opcion.equals("4"));		
	}///main

	private static void muestraExtremas(ArrayList temperaturas) {
		// TODO Auto-generated method stub
		double maxima;
		maxima=((Double)temperaturas.get(0)).doubleValue();
		double minima=maxima;
		for (Object tp : temperaturas) {
			double aux;
			aux=((Double)tp).doubleValue();
			if(aux>maxima){
				maxima=aux;
			}
			if(aux<minima){
				minima=aux;
			}
		}
		System.out.println("Temperatura Maxima " + maxima);
		System.out.println("Temperatura Minima " + minima);
	}

	private static void muestraMedia(ArrayList temperaturas) {
		// TODO Auto-generated method stub
		double media=0.0;
		for (Object ob : temperaturas) {
			media+=((Double)ob).doubleValue();
		}
		media/=temperaturas.size();
		System.out.println("Temperatura media = " + media);
	}

	private static void almacenaTemperatura(double temp, ArrayList temperaturas) {
		// TODO Auto-generated method stub
		temperaturas.add(new Double(temp));
	}

}
