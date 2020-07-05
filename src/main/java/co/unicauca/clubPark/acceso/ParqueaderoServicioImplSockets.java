package co.unicauca.clubPark.acceso;

import co.unicauca.clubPark.negocio.Parqueadero;
import co.unicauca.clubPark.negocio.Persona;
import co.unicauca.clubPark.negocio.RegParqueadero;
import co.unicauca.clubPark.negocio.RegVehiculo;
import co.unicauca.clubPark.negocio.Tarifa;
import co.unicauca.clubPark.negocio.Vehiculo;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author javier
 */
public class ParqueaderoServicioImplSockets implements IParqueadero{
    
    //Creamos las variables para conectarse implementando sockets 
    private int cambio=0;
    
    private Socket socket = null;
    private Scanner entrada;
    private PrintStream salida;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    
    //Lee los flujos del socket
    private String leerFlujoEntradaSalida(String solicitud) throws IOException{
        String respuesta = "";
        entrada = new Scanner(socket.getInputStream());
        salida = new PrintStream(socket.getOutputStream());
        salida.flush();
        
        salida.println(solicitud);
        if (entrada.hasNextLine()) {
            respuesta = entrada.nextLine();        
        }
        return respuesta;
    }
    
    //Cierra los flujos del socket
    private void cerrarFlujos(){
        salida.close();
        entrada.close();
    }
    
    // desconecta el socket
    private void desconectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //conecta el socket
    public void conectar(String address, int port) throws IOException {
        socket = new Socket(address, port);
        System.out.println("Conectado");
    }
    @Override
    public int getCambio(){
        return this.cambio;
    }
    
    @Override
    public void setCambio(int c){
        this.cambio=c;
    }
    
    //Metodo que sirve para ingresar un vehiculo 
    @Override
    public void ingresarRegVehiculo(String numFicha,String Placa, String TipoVehiculo,String HoraFechaEntrada,String EstadoVehiculo,String Llaves,String NumCascos,String NitParqueadero,String NumCasillero,String Usuario,String HoraFechaSalida){
        try{
            conectar(IP_SERVIDOR, PUERTO);
            leerFlujoEntradaSalida("ingresarRegVehiculo," + numFicha+"," + Placa+"," + TipoVehiculo+"," + HoraFechaEntrada+"," + EstadoVehiculo+"," + Llaves+"," + NumCascos+"," + NitParqueadero+"," + NumCasillero +"," + Usuario+ "," + HoraFechaSalida);     
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    //Metodo para ingresar un nuevo parquedero
    @Override
    public void ingresarParqueadero(String nit, String nombre, String direccion, String telefono, String usuario, int libres, int ocupados){
        try {
            conectar(IP_SERVIDOR, PUERTO);
            leerFlujoEntradaSalida("ingresarParqueadero," + nit+"," + nombre+ ","+ direccion+ ","+ telefono+ ","+ usuario+ ","+ libres+ ","+ ocupados);
            cerrarFlujos();
            desconectar();
       } catch (Exception e) {
           Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE,null,e);
       }
    }
    
      //Metodo para consultar una persona
    @Override
    public Persona consultarPersona(String Usuario,String Contraseña)throws Exception{
        String jsonPersona = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            jsonPersona = leerFlujoEntradaSalida("consultarPersona,"+Usuario+","+Contraseña);
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null,ex);
        }
        if (jsonPersona == null) {
            throw new Exception("No se pudo conectar con el servidor");
        }else{
            if (!jsonPersona.equals("NO_ENCONTRADO")) {
                Persona per = new Persona();
                parseToPersona(per, jsonPersona);
                return per;
            }
        }
        return null;
    }
    
    //Metodo para actualizar el parqueadero, cuando se ingresa un vehiculo a un parqueadero
    @Override
    public void actualizarIngreso(String nit){
        
         try {
           conectar(IP_SERVIDOR, PUERTO);
           leerFlujoEntradaSalida("actualizarIngreso," + nit);
           cerrarFlujos();
           desconectar();
       } catch (Exception ex) {
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE,null,ex);
       }   
    } 
    
    //Metodo para actualizar el parqueadero, cuando se retira un vehiculo de un parqueadero
    @Override
    public void actualizarSalida(String nit){
        
         try {
           conectar(IP_SERVIDOR, PUERTO);
           leerFlujoEntradaSalida("actualizarSalida," + nit);
           cerrarFlujos();
           desconectar();
       } catch (Exception ex) {
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE,null,ex);
       }   
    } 
   
     //Metodo que para actualizar el estado del vehiculo cuando sea retirado 
    @Override
    public void actualizarRegVehiculo(String Placa, String HoraFechaSalida) {

        try {
            conectar(IP_SERVIDOR, PUERTO);
            leerFlujoEntradaSalida("actualizarRegVehiculo," + Placa + "," + HoraFechaSalida);
            cerrarFlujos();
            desconectar();
        } catch (IOException ex) {
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Metodo para consultar un vehiculo
    @Override
    public Vehiculo consultarVehiculo(String Placa)throws Exception{
        
        String jsonVehiculo = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            jsonVehiculo = leerFlujoEntradaSalida("consultarVehiculo,"+Placa);
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null,ex);
        }
        if (jsonVehiculo == null) {
            throw new Exception("No se pudo conectar con el servidor");
        }else{
            if (!jsonVehiculo.equals("NO_ENCONTRADO")) {
                Vehiculo vehiculo = new Vehiculo();
                parseToVehiculo(vehiculo,jsonVehiculo);
                return vehiculo;
            }
        }
        return null;
    }
    
    //Metodo para consultar un parqueadero
    @Override
    public Parqueadero consultarParqueadero(String Usuario)throws Exception{
        String jsonParqueadero = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            jsonParqueadero=leerFlujoEntradaSalida("consultarParqueadero,"+Usuario);
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null,ex);
        }
        if (jsonParqueadero == null) {
            throw new Exception("No se pudo conectar con el servidor");
        }else{
            if (!jsonParqueadero.equals("NO_ENCONTRADO")) {
                Parqueadero parq = new Parqueadero();
                parseToParqueadero(parq, jsonParqueadero);
                return parq;
            }
        }
        return null;
    }
    
    //Metodo para consultar un vehiculo por placa 
    @Override
    public RegVehiculo consultarRegVehiculoPlaca(String Placa)throws Exception{
        
        String jsonRegVehiculoP = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            jsonRegVehiculoP = leerFlujoEntradaSalida("consultarRegVehiculoPlaca,"+Placa);
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null,ex);
        }
        if (jsonRegVehiculoP == null) {
            throw new Exception("No es posible conectar con el servidor");
        }else{
            if (!jsonRegVehiculoP.equals("NO_ENCONTRADO")) {
                RegVehiculo regVehiP = new RegVehiculo();
                
               parseToRegVehiculo(regVehiP,jsonRegVehiculoP);
                return regVehiP;
            }
        }
        return null;
    }
    
    //Metodo para consultar un vehiculo por ficha
    @Override
    public RegVehiculo consultarRegVehiculoFicha(String Ficha)throws Exception{
        
        String jsonRegVehiculoF = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            jsonRegVehiculoF = leerFlujoEntradaSalida("consultarRegVehiculoFicha,"+Ficha);
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null,ex);
        }
        if (jsonRegVehiculoF == null) {
            throw new Exception("No es posible conectar con el servidor");
        }else{
            if (!jsonRegVehiculoF.equals("NO_ENCONTRADO")) {
                RegVehiculo regVehiF = new RegVehiculo();
                parseToRegVehiculo(regVehiF,jsonRegVehiculoF);
                return regVehiF;
            }
        }
        return null;
    }
    
   //Metodo para consultar una tarifa para carro y devolver el valor total a pagar
    @Override
    public Tarifa consultarTarifa(String Horas,String Minutos)throws Exception{
        String jsonTarifa = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            jsonTarifa = leerFlujoEntradaSalida("consultarTarifa," + Horas + "," + Minutos);
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null,ex);
        }
        if (jsonTarifa == null) {
            throw new Exception("No es posible conectar con el servidor");
        }else{
            if (!jsonTarifa.equals("NO_ENCONTRADO")) {
                Tarifa tarifa = new Tarifa();
                parseToTarifa(tarifa, jsonTarifa);
                return tarifa;
            }
        }
        return null;
    }
    
    //Metodo para consultar la tarifa para motos y devolver el valor total a pagar
    @Override
    public Tarifa consultarTarifaMotos(String Horas,String Minutos)throws Exception{
        String jsonTarifa = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            jsonTarifa = leerFlujoEntradaSalida("consultarTarifaMotos," + Horas + "," + Minutos);
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null,ex);
        }
        if (jsonTarifa == null) {
            throw new Exception("No es posible conectar con el servidor");
        }else{
            if (!jsonTarifa.equals("NO_ENCONTRADO")) {
                Tarifa tarifa = new Tarifa();
                parseToTarifa(tarifa, jsonTarifa);
                return tarifa;
            }
        }
        return null;
    }
    
     @Override
    public void consultarPuestos(String nombre) throws Exception {
        
        String jsonParqueadero = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            jsonParqueadero=leerFlujoEntradaSalida("consultarPuestos,"+nombre);
            cerrarFlujos();
            desconectar();
        }catch(IOException ex){
            Logger.getLogger(ParqueaderoServicioImplSockets.class.getName()).log(Level.SEVERE, null,ex);
        }
        if (jsonParqueadero == null) {
            throw new Exception("No se pudo conectar con el servidor");
        }
        
    }
    
    //metodo para parsear de JSON a vehiculo
    private void parseToVehiculo(Vehiculo vehi,String Json){
        
        Gson gson = new Gson();
        Properties prop = gson.fromJson(Json, Properties.class);
        
        vehi.setTipoVehiculo(prop.getProperty("placaVehiculo"));
        vehi.setTipoVehiculo(prop.getProperty("tipoVehiculo"));
        
    }
    
    //metodo para parsear de JSON a persona
    private void parseToPersona(Persona per,String Json){
        Gson gson = new Gson();
        Properties prop = gson.fromJson(Json, Properties.class);
        
        per.setPerID(prop.getProperty("perID"));
        per.setPerNombres(prop.getProperty("perNombres"));
        per.setPerApellidos(prop.getProperty("perApellidos"));
        per.setPerRol(prop.getProperty("perRol"));
        per.setPerTelefono(prop.getProperty("perTelefono"));
        per.setPerUsuario(prop.getProperty("perUsuario"));
        per.setPerContraseña(prop.getProperty("perContraseña"));
                
    }
    
    //metodo para parsear de JSON a parqueadero
    private void parseToParqueadero(Parqueadero par,String Json){
        Gson gson = new Gson();
         System.out.println(Json);
        Properties prop = gson.fromJson(Json, Properties.class);
        
        par.setNitParqueadero(prop.getProperty("nitParqueadero"));
        par.setNomParqueadero(prop.getProperty("nomParqueadero"));
        par.setDirecParqueadero(prop.getProperty("direcParqueadero"));
        par.setTelParqueadero(prop.getProperty("telParqueadero"));
        par.setUsuarioPar(prop.getProperty("usuarioPar"));
        par.setLibres(prop.getProperty("puestosLibres"));
        par.setOcupados(prop.getProperty("puestosOcupados"));
        
    }
    
    //metodo para parsear de JSON a RegVehiculo
    private void parseToRegVehiculo(RegVehiculo reg,String Json){
        Gson gson = new Gson();
        System.out.println(Json);
        Properties properties = gson.fromJson(Json, Properties.class);
        
        reg.setRegNumFicha(properties.getProperty("regNumFicha"));
        reg.setRegPlacaVehiculo(properties.getProperty("regPlacaVehiculo"));
        reg.setRegTipoVehiculo(properties.getProperty("regTipoVehiculo"));
        reg.setRegHoraYFechaEntrada(properties.getProperty("regHoraYFechaEntrada"));
        reg.setRegEstadoVehiculo(properties.getProperty("regEstadoVehiculo"));
        reg.setRegLlaves(properties.getProperty("regLlaves"));
        reg.setRegNumCascos(properties.getProperty("regNumCascos"));
        reg.setRegNitParqueadero(properties.getProperty("regNitParqueadero"));
        reg.setRegNumCasillero(properties.getProperty("regNumCasillero"));
        reg.setRegUsuario(properties.getProperty("regUsuario"));
        reg.setRegHoraYFechaSalida(properties.getProperty("regHoraYFechaSalida"));
    }
    
    private void parseToRegParqueadero(RegParqueadero reg, String Json){
        Gson gson = new Gson();
        System.out.println(Json);
        Properties properties = gson.fromJson(Json, Properties.class);
        
        reg.setNitParqueadero(properties.getProperty("nitParqueadero"));
        reg.setNomParqueadero(properties.getProperty("nomParqueadero"));
        reg.setDirecParqueadero(properties.getProperty("direcParqueadero"));
        reg.setTelParqueadero(properties.getProperty("telParqueadero"));
        reg.setUsuarioPar(properties.getProperty("usuarioPar"));
        reg.setPuestos(properties.getProperty("puestosLibres")); 
        reg.setPuestos(properties.getProperty("puestosOcupados")); 
    }
    
    //metodo para parsear de JSON a tarifa
    private void parseToTarifa(Tarifa tari,String Json){
        Gson gson = new Gson();
        System.out.println(Json);
        Properties prop = gson.fromJson(Json, Properties.class);
        
        tari.setIdTarifa(prop.getProperty("idTarifa"));
        tari.setTarifaHora(prop.getProperty("tarifaHora"));
        tari.setTarifaMedioDia(prop.getProperty("tarifaMedioDia"));
        tari.setTarifaDia(prop.getProperty("tarifaDia"));
        tari.setValorTotal(prop.getProperty("ValorTotal"));
    }

   
    
    

   

   

   

    
}
