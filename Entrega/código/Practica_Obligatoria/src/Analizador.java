import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
/**
*/
public class Analizador{
	
	public static void main(String argv[]){
		if (argv.length == 0) {
		System.out.println("Inserta nombre de archivo\n"+"( Usage : java Analizador <inputfile> )");
		} else {
			for (int i = 0; i < argv.length; i++) {
				AnalizadorLexico lexico = null;
				try {
					lexico = new AnalizadorLexico( new java.io.FileReader(argv[i]));
					parser sintactico = new parser(lexico);
					
					String titulo = argv[0];
                    String ruta = titulo.substring(0, titulo.length()-2)+".pas";
                    File archivo = new File(ruta);
                    FileWriter fw = new FileWriter(archivo,false);
                    fw.write("");
                    PrintStream ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(archivo,true)),true);
                    System.setOut(ps);
					sintactico.parse();
				}
				catch (java.io.FileNotFoundException e) {
					System.out.println("Archivo \""+argv[i]+"\" no encontrado.");
				}
				catch (java.io.IOException e) {
					System.out.println("Error durante la lectura del"+" archivo \""+argv[i]+"\".");
					e.printStackTrace();
				}
				catch (Exception e) {
					System.out.println("Excepcion:");
					System.out.println(e.getMessage());
					e.printStackTrace();
				}
			}
		}
	}
}