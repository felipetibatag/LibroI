import java.io.File;
import java.io.IOException;


public class fichero1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("datos");//crea directorio
		f.mkdir();
		File archivo=new File(f,"info.txt");
		archivo.createNewFile();
	}

}
