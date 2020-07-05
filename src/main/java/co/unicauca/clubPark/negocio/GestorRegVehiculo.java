package co.unicauca.clubPark.negocio;
import co.unicauca.clubPark.acceso.IParqueadero;
import co.unicauca.clubPark.acceso.ParqueaderoServicioImplSockets;

/**
 *
 * @author javier
 */
public class GestorRegVehiculo {
    private final IParqueadero parqueadero;
    
    //Constructor
    public GestorRegVehiculo(){
        parqueadero = new ParqueaderoServicioImplSockets();
    }
    
    //Constructor parametrizado
    public GestorRegVehiculo(IParqueadero i){
        parqueadero = i;
    }
    
    /**
     * Crea un nuevo registro al ingresar un vehiculo a un parqueadero y lo pasa al servidor
     * @param numFicha
     * @param Placa
     * @param TipoVehiculo
     * @param HoraFechaEntrada
     * @param EstadoVehiculo
     * @param Llaves
     * @param NumCascos
     * @param NitParqueadero
     * @param NumCasillero
     * @param Usuario
     * @param HoraFechaSalida 
     */        
    public void ingresarRegVehiculo(String numFicha,String Placa, String TipoVehiculo,String HoraFechaEntrada,String EstadoVehiculo,String Llaves,String NumCascos,String NitParqueadero,String NumCasillero,String Usuario,String HoraFechaSalida){
        this.parqueadero.ingresarRegVehiculo(numFicha, Placa, TipoVehiculo, HoraFechaEntrada, EstadoVehiculo, Llaves, NumCascos, NitParqueadero, NumCasillero,Usuario,HoraFechaSalida);
    }
    
    /**
     * Consulta los datos de un registro de vehiculo dependiendo de la placa que se ingrese en el login
     * @param Placa
     * @return
     * @throws Exception 
     */
    public RegVehiculo consultarRegVehiculoPlaca(String Placa)throws Exception{
        return parqueadero.consultarRegVehiculoPlaca(Placa);
    }
    
    /**
     * Consulta los datos de un registro de vehiculo dependiendo del número de ficha que se ingrese en el login
     * @param Ficha
     * @return
     * @throws Exception 
     */
    public RegVehiculo consultarRegVehiculoFicha(String Ficha)throws Exception{
        return parqueadero.consultarRegVehiculoFicha(Ficha);
    }
    
    /**
     * Actualiza el estado del vehiculo que antes ha sido ingresado a un parqueadero
     * @param Placa
     * @param HoraFechaSalida 
     */
    public void actualizarRegVehiculo(String Placa,String HoraFechaSalida) {
       this.parqueadero.actualizarRegVehiculo(Placa, HoraFechaSalida);
   }
    
}
