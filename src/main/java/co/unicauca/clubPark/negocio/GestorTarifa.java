package co.unicauca.clubPark.negocio;

import co.unicauca.clubPark.acceso.IParqueadero;
import co.unicauca.clubPark.acceso.ParqueaderoServicioImplSockets;

/**
 *
 * @author javier
 */
public class GestorTarifa {
    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorTarifa(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    //Constructor parametrizado
    public GestorTarifa(IParqueadero i){
        parqueadero = i;
    }
    
    /**
     * Metodo para consultar la tarifa para carros del parqueadero y devolver el total que debe pagar el cliente por el servicio
     * @param Horas
     * @param Minutos
     * @return
     * @throws Exception 
     */
    public Tarifa consultarTarifa(String Horas,String Minutos)throws Exception{
        return parqueadero.consultarTarifa(Horas, Minutos);
    }
    
    /**
     * Metodo para consultar la tarifa para motos del parqueadero y devolver el total que debe pagar el cliente por el servicio
     * @param Horas
     * @param Minutos
     * @return
     * @throws Exception 
     */
    public Tarifa consultarTarifaMotos(String Horas,String Minutos)throws Exception{
        return parqueadero.consultarTarifaMotos(Horas, Minutos);
    }
}
