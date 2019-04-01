import java.util.ArrayList;


public class Linea {
	private ArrayList<Elemento> elementos;
	private String tipo;
	private String tipo_variable;
	private boolean tieneReturn;
	private String tabulacion;
	public Linea(ArrayList<Elemento> elementos,String tipo) {
		this.elementos = elementos;
		this.tipo = tipo;
		this.tabulacion="";
	}
	
	
	public Linea(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}


	public String getTabulacion() {
		return tabulacion;
	}


	public void setTabulacion(String tabulacion) {
		this.tabulacion = tabulacion;
	}


	public String getTipo_variable() {
		return tipo_variable;
	}


	public void setTipo_variable(String tipo_variable) {
		this.tipo_variable = tipo_variable;
	}


	public ArrayList<Elemento> getElementos() {
		return elementos;
	}


	public void setElementos(ArrayList<Elemento> elementos) {
		this.elementos = elementos;
	}

	
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public boolean isTieneReturn() {
		return tieneReturn;
	}


	public void setTieneReturn(boolean tieneReturn) {
		this.tieneReturn = tieneReturn;
	}


	public String imprime(){
		String linea="";
        for(Elemento e:elementos){
            linea = linea +e.imprime();
        }
        if(this.tipo == "declaracion_variable"){
        	linea = linea;
        }else{
        	linea = linea + "\n";
        }
        
        return linea;
	}
}
