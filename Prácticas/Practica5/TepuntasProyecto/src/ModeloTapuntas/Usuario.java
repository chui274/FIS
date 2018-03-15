/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloTapuntas;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Sofia Fernandez Moreno
 */
class Usuario {
    private String nombreUsuario;
    private String contraseña;
    private String direccionCorreo;
    private boolean visibilidad = false;
    private boolean pendienteBaja = false;
    // incluir los demás atributos
    private String nombre;
    private String telefono;
    private String breveDescripciónPersonal;
    
            
 

    Usuario(String nombreUsuario, String contraseña, String direccionCorreo,boolean visibilidad,boolean pendienteBaja,String nombre,String telefono,String breveDescripciónPersonal) {
      this.nombreUsuario= nombreUsuario;
      this.contraseña = contraseña;
      this.direccionCorreo = direccionCorreo;
      this.visibilidad = visibilidad;
      this.pendienteBaja = pendienteBaja;
    // incluir los demás atributos
      this.nombre=nombre;
      this.telefono=telefono;
      this.breveDescripciónPersonal=breveDescripciónPersonal;
      
    }
    protected void modificarVisibilidad(boolean visibilidad){}
    protected void nuevoVehículo(String matricula, String marca, String modelo, String color, int numeroPlazas, String categoría , String confor){}
    protected String obtenerPlanesQueCumplanRequisitos(String ciudadRecogida , Date fechaInicio , Date fechaFin){}
    protected void definirPlanAlquiler(String matricula , Date fechaInicio, Date fechaFin, String ciudadRecogida ){}
    protected void eliminarVehículo(String matricula){}
    protected introducirPerfil(String nombre , String telefono, String breveDescripcion , preferenciaCobro : TipoTransacción[1..4]) {}
    protected String obtenerPlanesAlquiler() {}
    protected String consultarPerfil() {}
    protected void ofertarPlanAlquiler(Date fechaInicio , String  matricula){}
    private ArrayList<Vehiculo> buscarVehículo(String matricula ){}
    private ArrayList<PlanAlquiler> buscarPlanAlquiler(Date fechaInicio,  String matricula) {}
}
