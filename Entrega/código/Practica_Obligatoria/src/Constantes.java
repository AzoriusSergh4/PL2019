import java.util.ArrayList;


public class Constantes {
	private ArrayList<Linea> constantes;

	public Constantes(ArrayList<Linea> constantes) {
		this.constantes = constantes;
	}

	public ArrayList<Linea> getConstantes() {
		return constantes;
	}

	public void setConstantes(ArrayList<Linea> constantes) {
		this.constantes = constantes;
	}

	public String imprime(){
		String resultado = "const\n";
		for(Linea l:constantes){
			resultado = resultado + "\t" + l.imprime();
		}
		return resultado;
	}
}
