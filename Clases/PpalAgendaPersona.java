import java.io.IOException;
import java.util.Enumeration;

public class PpalAgendaPersona {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		//con arraylist
		AgendaPersona a=new AgendaPersona();
		Persona p;
		
		//a.agregar("80926390","Felipe Tibata",2250376);
//		for (int i = 0; i < 10; i++) {
//			a.agregar("cedula " +  i, "felipe "+ i, i);
//			AlmacenaAgenda.escribirObj(a, "Agenda.obj");
//		}
		
		
		AgendaPersona al=AlmacenaAgenda.leerObj("Agenda.obj");
		
		al.imprimeAgenda();
		
		
		
		
//		AgendaHashtable ah=new AgendaHashtable();
//		ah.agregar("80926390", "Felipe", 2250376);
//		ah.agregar("1", "Menganito", 6607802);
//		ah.agregar("2", "Sutanito", 5405454);
//		ah.agregar("3", "Pepinito", 6602530);
//		
//		//ah.recuperar("3").toString();
//		ah.eliminar("80926390");
//		Enumeration e=ah.total();
//		while(e.hasMoreElements()){
//			String valor=(String)e.nextElement();
//			System.out.println(ah.recuperar(valor));
//		}
		
	
		
		

	}

}
