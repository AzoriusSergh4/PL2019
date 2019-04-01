import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


public class Programa {
	private ArrayList<Funcion> funciones;
	private Constantes constantes;
	private Funcion principal;
	private boolean tiene_main;
	private boolean error;
	public Programa(ArrayList<Funcion> funciones,Funcion p) {
		this.funciones = funciones;
		this.principal=p;
	}
	
	public boolean isTiene_main() {
		return tiene_main;
	}

	public void setTiene_main(boolean tiene_main) {
		this.tiene_main = tiene_main;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	public Constantes getConstantes() {
		return constantes;
	}

	public void setConstantes(Constantes constantes) {
		this.constantes = constantes;
	}

	String imprime() throws Exception{
		if(!this.isError()){
			if(this.isTiene_main()){// program
				if (principal.getCabecera().isSinArgumentos()){
					String resultado ="program " + principal.getNombre() + ";\n";
					if(!constantes.getConstantes().isEmpty()){
						resultado = resultado + constantes.imprime();
					}
					if(!principal.getVariables().getVariables().isEmpty()){
						resultado = resultado + principal.getVariables().imprime();
					}
					
					for(Funcion f:funciones){
						resultado = resultado + f.imprime();
					}
					resultado = resultado + principal.getCuerpo().imprime();
					resultado = resultado.substring(0,resultado.length()-1);
					resultado = resultado + ".";
					System.out.println(resultado);
					
					
					
					return resultado;
				}else{
					throw new Exception("La funcion main tiene argumentos");
				} 
			}else{//unit
				String resultado ="unit " + "libreria" + ";\n";
				if(!constantes.getConstantes().isEmpty()){
					resultado = resultado + constantes.imprime();
				}
				for(Funcion f:funciones){
					resultado = resultado + f.imprime();
				}
				resultado = resultado.substring(0,resultado.length()-3);
				resultado = resultado + ".";
				System.out.println(resultado);

				return resultado;
			}
			
		}
		throw new Exception("Tiene mas de un main");
		
	}
}
