package PracticaSwingArchivos;

import java.util.ArrayList;

public class ListadoNombres {
	ArrayList<Nombres> lista=new ArrayList<Nombres>();
	public ListadoNombres(){}
	public void agregar(Nombres nombre){
		lista.add(nombre);
	}
	public String imprimir(){
		String resultado ="";
		if (!lista.isEmpty()){
			for (Nombres nombres : lista) {
				resultado+=nombres.getNombre() + "\n";
			}
			return resultado;
		}else{
			return "Lista vacia";
		}
		
	}
	public Nombres buscar(String n){
		Nombres resultado=null;
		for (Nombres nombres : lista) {
			if(nombres.getNombre().contentEquals(n)){
				resultado=nombres;
			}else{
				resultado=null;
			}
		}
		
		return resultado;
	}
	public boolean eliminar(String n){
		if(buscar(n)!=null){
			lista.remove(n);
			return true;
		}else{
			return false;
		}
	}

}
