import java.util.ArrayList;


public class Variables {
	private ArrayList<Linea> variables;

	public Variables(ArrayList<Linea> variables) {
		this.variables = variables;
	}

	public ArrayList<Linea> getVariables() {
		return variables;
	}

	public void setVariables(ArrayList<Linea> variables) {
		this.variables = variables;
	}

	public String imprime(){
		String resultado = "var\n";
		String integers = "";
		String reales ="";
		String anterior = "";
		String actual = "";
		for(Linea l:variables){
			actual = l.getTipo_variable();
			if(actual == anterior){
				if(l.getTipo_variable().equals("INTEGER")){
					integers = integers + l.imprime();
					integers = integers.substring(0, integers.length()-13) + ", ";
				}else if(l.getTipo_variable().equals("REAL")){
					reales = reales + l.imprime();
					reales = reales.substring(0, reales.length()-10) + ", ";
				}
				
				anterior = actual;
			}else{
				if(!integers.isEmpty()){
					integers = integers.substring(0, integers.length()-2);
					integers = integers + " : INTEGER ;\n";
					resultado = resultado + "\t" + integers;
					integers="";
				}
				if(!reales.isEmpty()){
					reales = reales.substring(0,reales.length()-2);
					reales = reales + " : REAL ;\n";
					resultado = resultado + "\t" + reales;
					reales="";
				}
				if(l.getTipo_variable().equals("INTEGER")){
					integers = integers + l.imprime();
					integers = integers.substring(0, integers.length()-13) + ", ";
				}else if(l.getTipo_variable().equals("REAL")){
					reales = reales + l.imprime();
					reales = reales.substring(0, reales.length()-10) + ", ";
				}
				anterior = actual;
			}
			
		}
		if(!integers.isEmpty()){
			integers = integers.substring(0, integers.length()-2);
			integers = integers + " : INTEGER ;\n";
			resultado = resultado + "\t" + integers;
		}
		if(!reales.isEmpty()){
			reales = reales.substring(0,reales.length()-2);
			reales = reales + " : REAL ;\n";
			resultado = resultado + "\t" + reales;
		}
		return resultado;
	}
}
