import java.util.ArrayList;

public class Pila <E>{
	
	
	ArrayList<E> listado=new ArrayList<E>();
	
	public void agregar(E elemento){
		
		if(listado.indexOf(elemento)<0){
			listado.add(elemento);			
		}
	}
	public void quitar(){
		listado.remove(listado.size()-1);
	}
	public int total(){
		return listado.size();
	}
	public E obtener(int pos){
		return listado.get(pos);
	}
}
