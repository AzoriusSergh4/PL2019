import java.util.ArrayList;


public class Cuerpo {
	private ArrayList<Linea> cuerpo;
	private Elemento nombre;
	private boolean tieneReturn;
	public Cuerpo(ArrayList<Linea> cuerpo) {
		this.cuerpo = cuerpo;
		this.tieneReturn = false;
	}
	
	public ArrayList<Linea> getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(ArrayList<Linea> cuerpo) {
		this.cuerpo = cuerpo;
	}

	public Elemento getNombre() {
		return nombre;
	}

	public void setNombre(Elemento nombre) {
		this.nombre = nombre;
	}
	
	public boolean isTieneReturn() {
		return tieneReturn;
	}

	public void setTieneReturn(boolean tieneReturn) {
		this.tieneReturn = tieneReturn;
	}

	public String imprime(){
		String resultado = "begin" + "\n";
		String tab; 
		for(Linea l:cuerpo){
			tab = l.getTabulacion();
			
			if(l.isTieneReturn()){
				if(tab!=null){
					resultado = resultado + "\t" + tab + nombre.getValor() + l.imprime();
				}else{
					resultado = resultado + "\t" + nombre.getValor() + l.imprime();
				}
				
			}else{
				if(tab!=null){
					resultado = resultado + "\t" + tab + l.imprime();
				}else{
					resultado = resultado + "\t" + l.imprime();
				}
			}
		}
		resultado = resultado + "end;"; 
		return resultado;
	}
}
