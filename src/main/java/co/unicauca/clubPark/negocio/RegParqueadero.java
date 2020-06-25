package co.unicauca.clubPark.negocio;
/**
 *
 * @author Javier
 */
public class RegParqueadero {
    
    private String nitParqueadero;
    private String nomParqueadero;
    private String direcParqueadero;
    private String telParqueadero;
    private String usuarioPar;
    private String puestos;

    public RegParqueadero(String nitParqueadero, String nomParqueadero, String direcParqueadero, String telParqueadero, String usuarioPar, String puestos) {
        this.nitParqueadero = nitParqueadero;
        this.nomParqueadero = nomParqueadero;
        this.direcParqueadero = direcParqueadero;
        this.telParqueadero = telParqueadero;
        this.usuarioPar = usuarioPar;
        this.puestos = puestos;
    }
    
    public RegParqueadero(){
        nitParqueadero = "";
        nomParqueadero = "";
        direcParqueadero = "";
        telParqueadero = "";
        usuarioPar = "";
        puestos = "";
    }

    public String getNitParqueadero() {
        return nitParqueadero;
    }

    public void setNitParqueadero(String nitParqueadero) {
        this.nitParqueadero = nitParqueadero;
    }

    public String getNomParqueadero() {
        return nomParqueadero;
    }

    public void setNomParqueadero(String nomParqueadero) {
        this.nomParqueadero = nomParqueadero;
    }

    public String getDirecParqueadero() {
        return direcParqueadero;
    }

    public void setDirecParqueadero(String direcParqueadero) {
        this.direcParqueadero = direcParqueadero;
    }

    public String getTelParqueadero() {
        return telParqueadero;
    }

    public void setTelParqueadero(String telParqueadero) {
        this.telParqueadero = telParqueadero;
    }

    public String getUsuarioPar() {
        return usuarioPar;
    }

    public void setUsuarioPar(String usuarioPar) {
        this.usuarioPar = usuarioPar;
    }

    public String getPuestos() {
        return puestos;
    }

    public void setPuestos(String puestos) {
        this.puestos = puestos;
    }
    
    
    
}
