import java.util.ArrayList;


public class Cabecera {
	private boolean esFuncion;
	private Elemento tipo;
	private Elemento identificador;
	private ArrayList<Elemento> parametros;
	private boolean tieneReturn;
	private boolean sinArgumentos;
	public Cabecera(ArrayList<Elemento> parametros) {
		this.parametros = parametros;
		this.tieneReturn = false;
		this.sinArgumentos = false;
	}
	
	
	public Elemento getTipo() {
		return tipo;
	}


	public void setTipo(Elemento tipo) {
		this.tipo = tipo;
	}


	public boolean isSinArgumentos() {
		return sinArgumentos;
	}


	public void setSinArgumentos(boolean sinArgumentos) {
		this.sinArgumentos = sinArgumentos;
	}


	public boolean isTieneReturn() {
		return tieneReturn;
	}


	public void setTieneReturn(boolean tieneReturn) {
		this.tieneReturn = tieneReturn;
	}


	public String imprime(){
		String resultado;
		if(this.tipo.getValor()=="INTEGER"||this.tipo.getValor()=="REAL"){
			resultado = "function"; 
			for(Elemento e:parametros){
				resultado = resultado + " " + e.getValor();
			}
			resultado = resultado + ":" + tipo.getValor() + ";" + "\n";
		}else{
			resultado = "procedure";
			for(Elemento e:parametros){
				resultado = resultado + " " + e.getValor();
			}
			resultado = resultado + ";" + "\n";
		}
		
		return resultado;
	}
}
