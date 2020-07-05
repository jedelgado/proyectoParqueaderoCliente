package co.unicauca.clubPark.negocio;

import co.unicauca.clubPark.acceso.IParqueadero;
import co.unicauca.clubPark.acceso.ParqueaderoServicioImplSockets;
/**
 *
 * @author javier
 */
public class GestorVehiculo {
    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorVehiculo(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    //Constructor parametrizado
    public GestorVehiculo(IParqueadero i){
        parqueadero = i;
    }
    
    /**
     * Metodo para consultar los datos del vehiculo o verificar la existencia de un vehiculo en el sistema
     * @param Placa
     * @return
     * @throws Exception 
     */
    public Vehiculo ConsultarVehiculo(String Placa)throws Exception{
        return parqueadero.consultarVehiculo(Placa);
    }
    
//    public void registrarVehiculo(String Placa, String TipoVehiculo){
//        this.parqueadero.registrarVehiculo(Placa, TipoVehiculo);
//    }
}
