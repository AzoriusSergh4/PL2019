
public class Funcion {
	private Cabecera cabecera;
	private Cuerpo cuerpo;
	private Variables variables;
	private String nombre;
	private String tipo_a_devolver;
	public Funcion(Cabecera cabecera, Cuerpo cuerpo, Variables vari) {
		this.cabecera = cabecera;
		this.cuerpo = cuerpo;
		this.variables = vari;
	}
	public Cabecera getCabecera() {
		return cabecera;
	}
	public void setCabecera(Cabecera cabecera) {
		this.cabecera = cabecera;
	}
	public Cuerpo getCuerpo() {
		return cuerpo;
	}
	public void setCuerpo(Cuerpo cuerpo) {
		this.cuerpo = cuerpo;
	}
	
	public Variables getVariables() {
		return variables;
	}
	public void setVariables(Variables variables) {
		this.variables = variables;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo_a_devolver() {
		return tipo_a_devolver;
	}
	public void setTipo_a_devolver(String tipo_a_devolver) {
		this.tipo_a_devolver = tipo_a_devolver;
	}
	
	public String imprime() throws Exception{
		if(cabecera.isTieneReturn()==cuerpo.isTieneReturn()){
			String resultado = cabecera.imprime();
			if(!variables.getVariables().isEmpty()){
				resultado = resultado + variables.imprime();
			}
			resultado = resultado + cuerpo.imprime() + "\n\n";
			return resultado;
		}else if(cabecera.isTieneReturn()==true && cuerpo.isTieneReturn()==false){
			throw new Exception("Falta el return");
		}else{
			throw new Exception("Sobra el return");
		}
	}
}
