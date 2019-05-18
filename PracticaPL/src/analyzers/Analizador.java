package analyzers;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
/**
 */
public class Analizador{
    public static void main(String argv[])
    {
        if (argv.length == 0) {
            System.out.println("Inserta nombre de archivo\n"+
                    "( Usage : java Analizador <inputfile> )");
        } else {
            for (int i = 0; i < argv.length; i++) {
                Lexico lexico = null;
                try {
                    File in = new File(argv[i]);
                    String[] names = in.getName().split("\\.");
                    String name = names[0];
                    lexico =
                            new Lexico( new java.io.FileReader(argv[i]));
                    parser sintactico = new parser(lexico);
                    sintactico.parse();

                    sintactico.c.bw.close();
                    File out = sintactico.c.file;
                    File compiled = new File(name + ".c");
                    if(compiled.exists()){
                        compiled.delete();
                    }
                    out.renameTo(compiled);

                }
                catch (java.io.FileNotFoundException e) {
                    System.out.println("Archivo \""+argv[i]+"\" no encontrado.");
                }
                catch (java.io.IOException e) {
                    System.out.println("Error durante la lectura del"
                            + " archivo \""+argv[i]+"\".");
                    e.printStackTrace();
                }
                catch (Exception e) {
                    System.out.println("Excepcion:");
                    e.printStackTrace();
                }
            }
        }
    }
}