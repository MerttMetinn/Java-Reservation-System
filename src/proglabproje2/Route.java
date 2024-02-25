
package proglabproje2;


public class Route {
    private String KalkısSehri;
    private String VarısSehri;
    private String RotaTipi;

    public String getKalkısSehri() {
        return KalkısSehri;
    }

    public void setKalkısSehri(String KalkısSehri) {
        this.KalkısSehri = KalkısSehri;
    }

    public Route(String KalkısSehri, String VarısSehri, String RotaTipi) {
        this.KalkısSehri = KalkısSehri;
        this.VarısSehri = VarısSehri;
        this.RotaTipi = RotaTipi;
    }

    public String getVarısSehri() {
        return VarısSehri;
    }

    public void setVarısSehri(String VarısSehri) {
        this.VarısSehri = VarısSehri;
    }

    public String getRotaTipi() {
        return RotaTipi;
    }

    public void setRotaTipi(String RotaTipi) {
        this.RotaTipi = RotaTipi;
    }

}
