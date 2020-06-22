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
    
}
