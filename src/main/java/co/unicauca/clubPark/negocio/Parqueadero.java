package co.unicauca.clubPark.negocio;

/**
 *
 * @author javier
 */
public class Parqueadero {
    private String nitParqueadero;
    private String nomParqueadero;
    private String direcParqueadero;
    private String telParqueadero;
    private String usuarioPar;
    private String puestosLibres;
    private String puestosOcupados;

    //Constructor parametrizado de la clase parqueadero

    public Parqueadero(String nitParqueadero, String nomParqueadero, String direcParqueadero, String telParqueadero, String usuarioPar, String puestosLibres, String puestosOcupados) {
        this.nitParqueadero = nitParqueadero;
        this.nomParqueadero = nomParqueadero;
        this.direcParqueadero = direcParqueadero;
        this.telParqueadero = telParqueadero;
        this.usuarioPar = usuarioPar;
        this.puestosLibres = puestosLibres;
        this.puestosOcupados = puestosOcupados;
    }
    
    //Constructor sin parametros de la clase parqueadero
    public Parqueadero(){
        nitParqueadero = "";
        nomParqueadero= "";
        direcParqueadero= "";
        telParqueadero= "";
        usuarioPar= "";
        puestosLibres= "";
        puestosOcupados= "";
    }
    
    /**
     * Getters y Setters para los atributos de la clase Parqueadero
     */
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
    
}
