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

    public String getTabbedVarslist(){
        String s = this.varslist;
        s = s.replace("\n","\n\t");
        s = "\t" + s;
        return s.substring(0,s.length()-1);
    }

    public void setDcllists(String dcllists) {
        this.dcllists = dcllists;
    }

    public void setVarslist(String varslist) {
        this.varslist = varslist;
    }
}
