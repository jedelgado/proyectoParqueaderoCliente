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
    private String libres;
    private String ocupados;

    //Constructor parametrizado de la clase parqueadero

    public Parqueadero(String nitParqueadero, String nomParqueadero, String direcParqueadero, String telParqueadero, String usuarioPar, String puestosLibres, String puestosOcupados) {
        this.nitParqueadero = nitParqueadero;
        this.nomParqueadero = nomParqueadero;
        this.direcParqueadero = direcParqueadero;
        this.telParqueadero = telParqueadero;
        this.usuarioPar = usuarioPar;
        this.libres = puestosLibres;
        this.ocupados = puestosOcupados;
      
    }
    
    //Constructor sin parametros de la clase parqueadero
    public Parqueadero(){
        nitParqueadero = "";
        nomParqueadero= "";
        direcParqueadero= "";
        telParqueadero= "";
        usuarioPar= "";
        libres= "";
        ocupados= "";
        
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

    public String getLibres() {
        return libres;
    }

    public void setLibres(String puestosLibres) {
        this.libres = puestosLibres;
    }

    public String getOcupados() {
        return ocupados;
    }

    public void setOcupados(String puestosOcupados) {
        this.ocupados = puestosOcupados;
    }

    
    
}
