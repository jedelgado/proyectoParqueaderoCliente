package co.unicauca.clubPark.negocio;

import co.unicauca.clubPark.acceso.IParqueadero;
import co.unicauca.clubPark.acceso.ParqueaderoServicioImplSockets;

/**
 *
 * @author javier
 */
public class GestorParqueadero {
    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorParqueadero(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    //Constructor con parametros
    public GestorParqueadero(IParqueadero i){
        parqueadero=i;
    } 
    
    /**
     * Comprueba la existencia de un parqueadero en el servidor
     * @param Usuario
     * @return
     * @throws Exception 
     */
    public Parqueadero consultarParqueadero(String Usuario)throws Exception{
        return parqueadero.consultarParqueadero(Usuario);
    }
    
    /**
     * Este metodo hace el registro de un nuevo parqueadero en la BD
     * @param nit
     * @param nombre
     * @param direccion
     * @param telefono
     * @param usuario
     * @param libres
     * @param ocupados 
    */
    public void ingresarParqueadero(String nit,String nombre, String direccion,String telefono,String usuario, int libres, int ocupados){
        this.parqueadero.ingresarParqueadero(nit, nombre, direccion, telefono, usuario, libres, ocupados);
    }
     
    /**
     * actualiza el parqueadero, cada vez que se ocupe un puesto del parqueadero.
     * @param nit 
     */
    public void actualizarIngreso(String nit){
        this.parqueadero.actualizarIngreso(nit);
    } 
    
    /**
     * actualiza el parqueadero, cada vez que se libere un puesto del parqueadero.
     * @param nit 
     */
    public void actualizarSalida(String nit){
        this.parqueadero.actualizarSalida(nit);
    } 
    
}
