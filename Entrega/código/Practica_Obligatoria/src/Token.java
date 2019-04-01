
public class Token {
	private String valor;
	private int column;
	private int row;
	
	
	public Token(String valor, int row, int column) {
		this.valor = valor;
		this.column = column;
		this.row = row;
	}
	public String getValor() {
		return valor;
	}
	
	public int getColumn() {
		return column;
	}
	
	public int getRow() {
		return row;
	}
}
