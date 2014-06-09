import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LecturaArchivo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File archivo=new File("info.txt");
		
		
		if(archivo.exists()){
			FileReader fr=new FileReader("info.txt");
			BufferedReader br=new BufferedReader(fr);
			String cad = "";
			do{
				System.out.println(cad);
			}while((cad=br.readLine())!=null);
		}
		

	} 

}
