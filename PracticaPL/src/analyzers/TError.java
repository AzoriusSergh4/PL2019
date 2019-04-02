package analyzers;

public class TError {
    String lex, type, description;
    int line, column;

    public TError(String lex, String type, String description, int line, int column) {
        this.lex = lex;
        this.type = type;
        this.description = description;
        this.line = line;
        this.column = column;
    }
}
