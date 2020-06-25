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
    
    //Busca al parqueadero en el servidor
    public Parqueadero consultarParqueadero(String Usuario)throws Exception{
        return parqueadero.consultarParqueadero(Usuario);
    }
    
     public void ingresarParqueadero(String nit,String nombre, String direccion,String telefono,String usuario, String libres, String ocupados){
        this.parqueadero.ingresarParqueadero(nit, nombre, direccion, telefono, usuario, libres, ocupados);
    }
     
    //actualiza el parqueadero, cada vez que se ocupe un puesto del parqueadero.
    public void actualizarIngreso(String nit){
        this.parqueadero.actualizarIngreso(nit);
    } 
    
    //actualiza el parqueadero, cada vez que se libere un puesto del parqueadero.
    public void actualizarSalida(String nit){
        this.parqueadero.actualizarSalida(nit);
    } 
    
}
