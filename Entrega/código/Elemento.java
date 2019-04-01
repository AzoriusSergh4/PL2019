
public class Elemento {
	private String valor;
	private String tipo;
	public Elemento(String valor, String tipo) {
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String imprime(){
		
		return this.valor + " ";
	}
}
