package analyzers;

import java.io.*;

public class Converter {
    public File file;
    private FileWriter fw;
    public BufferedWriter bw;

    public Converter(){
        this.file = new File("texto.txt");
        try {
            this.fw = new FileWriter(file);
            this.bw = new BufferedWriter(fw);
        }catch(IOException io){System.out.println("Error en los writers");}
    }
}
