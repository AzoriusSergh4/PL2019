package analyzers;

public class Token {
    String lex;
    int line;
    int column;

    public Token(String lex, int line, int column){
        this.lex = lex;
        this.line = line;
        this.column = column;
    }

    public String getLex() {
        return lex;
    }

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }
}
