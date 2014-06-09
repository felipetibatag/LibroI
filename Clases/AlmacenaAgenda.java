import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class AlmacenaAgenda{
	public static void escribirObj(AgendaPersona a,String archivo) throws IOException {
		FileOutputStream fs=new FileOutputStream(archivo);
		ObjectOutputStream os=new ObjectOutputStream(fs);
		os.writeObject(a);
		os.close();
		
	}
	public static AgendaPersona leerObj(String archivo) throws IOException, ClassNotFoundException{
		FileInputStream fs=new FileInputStream(archivo);
		ObjectInputStream os=new ObjectInputStream(fs);
		AgendaPersona p=(AgendaPersona)os.readObject();
		os.close();
		return p;
	}

}
