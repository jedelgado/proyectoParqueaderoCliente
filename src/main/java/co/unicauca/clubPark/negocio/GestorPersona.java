package co.unicauca.clubPark.negocio;

import co.unicauca.clubPark.acceso.IParqueadero;
import co.unicauca.clubPark.acceso.ParqueaderoServicioImplSockets;

/**
 *
 * @author javier
 */
public class GestorPersona {

    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorPersona() {
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    
    //Constructor parametrizado
    public GestorPersona(IParqueadero i) {
        parqueadero = i;
    }
    
    //Consulta a un usuario dependiendo del usuario y contraseña que ingrese en el login
    public Persona consultarPersona(String Usuario, String Contraseña) throws Exception {
        return parqueadero.consultarPersona(Usuario, Contraseña);
    }
}
