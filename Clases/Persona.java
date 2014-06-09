import java.io.Serializable;

public class Persona implements Serializable{
	private String dni;
	private String nombre;
	private long telefono;
	
	public Persona(String dni, String nombre, long telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
	}
	
	public Persona() {
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String respuesta="";
		respuesta +="\n\nDni " + this.dni + " \nTelefono " + this.telefono + "\nNombre " + this.nombre;
		return respuesta;
	}
	
	

}
