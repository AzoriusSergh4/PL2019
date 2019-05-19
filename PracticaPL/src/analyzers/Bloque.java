package analyzers;

public class Bloque {
    private String dcl;
    private String variables;
    private String sent;

    public Bloque(String dcl, String variables, String sent) {
        this.dcl = dcl;
        this.variables = variables;
        this.sent = sent;
    }

    public String getDcl() {
        return dcl;
    }

    public String getVariable() {
        return variables;
    }

    public String getSent() {
        return sent;
    }

    public String getAll(){
        String things = this.dcl + this.variables + this.sent;
        things = things.replace("\n","\n\t");
        return things;
    }
}
