import java.io.Serializable;
import java.util.ArrayList;

public class AgendaPersona implements Serializable {
	private ArrayList<Persona> agenda=new ArrayList<Persona>();

	
	public boolean agregar(String dni,String nom,long tel){
		boolean estado;
		if(buscar(dni)==null){
			agenda.add(new Persona(dni,nom,tel));
			estado=true;
		}else{
			estado=false;
		}
		return estado;
	}
	
	
	public boolean eliminar(String dni,Persona p){
		boolean estado;
		if(buscar(dni)!=null){
			agenda.remove(agenda.indexOf(p));
			estado=true;
		}else{
			estado=false;
		}
		return estado;
	}
	
	public int total(){
		return agenda.size();
	}
	
	public Persona buscar(String dni){
		Persona resultado=null;
		for (Persona a : agenda) {
			if(a.getDni().equalsIgnoreCase(dni)){
				return resultado=a;
			}
		}		
		return resultado;
	}
	
	public void imprimeAgenda(){
		for (Persona a : agenda) {
			System.out.println(a.getDni() + "\t" + a.getNombre());
			
		}
	}
	

}
