package analyzers;

public class DCLList {
    private String dcllists;
    private String varslist;

    public DCLList(String dcllists, String varslist) {
        this.dcllists = dcllists;
        this.varslist = varslist;
    }

    public String getDcllists() {
        return dcllists;
    }

    public String getVarslist() {
        return varslist;
    }

    public void setDcllists(String dcllists) {
        this.dcllists = dcllists;
    }

    public void setVarslist(String varslist) {
        this.varslist = varslist;
    }
}
