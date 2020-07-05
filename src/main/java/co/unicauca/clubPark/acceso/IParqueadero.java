package co.unicauca.clubPark.acceso;

import co.unicauca.clubPark.negocio.Parqueadero;
import co.unicauca.clubPark.negocio.Persona;
import co.unicauca.clubPark.negocio.RegVehiculo;
import co.unicauca.clubPark.negocio.Tarifa;
import co.unicauca.clubPark.negocio.Vehiculo;

/**
 *Interfaz con todos los metodos que seran implementados en la clase
 * parqueaderoServicioImplSockets
 */
public interface IParqueadero {
    public void ingresarRegVehiculo(String numFicha,String Placa, String TipoVehiculo,String HoraFechaEntrada,String EstadoVehiculo,String Llaves,String NumCascos,String NitParqueadero,String NumCasillero,String Usuario,String HoraFechaSalida);
    public void ingresarParqueadero(String nit, String nombre, String direccion, String telefono, String usuario, int libres, int ocupados);
    public Vehiculo consultarVehiculo(String Placa)throws Exception;
    public void actualizarIngreso(String nit);
    public void actualizarSalida(String nit);
    public RegVehiculo consultarRegVehiculoPlaca(String Placa)throws Exception;
    public RegVehiculo consultarRegVehiculoFicha(String Ficha)throws Exception;
    public void actualizarRegVehiculo(String Placa,String HoraFechaSalida);
    public int getCambio();
    public void setCambio(int c);
    public Tarifa consultarTarifa(String Horas,String Minutos)throws Exception;
    public Parqueadero consultarParqueadero(String Usuario)throws Exception;
    public Tarifa consultarTarifaMotos(String Horas,String Minutos)throws Exception;
    public Persona consultarPersona(String Usuario,String Contraseña)throws Exception;
    public void consultarPuestos(String nombre) throws Exception;
    
}
