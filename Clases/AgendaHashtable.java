import java.util.Enumeration;
import java.util.Hashtable;

public class AgendaHashtable {
	private Hashtable<String,Persona> agendaH=new Hashtable<String,Persona>();
	
	public boolean agregar(String dni,String nom, long tel){
		if (agendaH.get(dni)==null) {
			agendaH.put(dni, new Persona(dni,nom,tel));
			return true;
		} 		
		return false;
	}
	
	public void eliminar(String dni){
		agendaH.remove(dni);
	}
	
	public Enumeration total(){
		return agendaH.keys();
		
	}
	
	public Persona recuperar(String dni){
		return agendaH.get(dni);
	}
	

}
