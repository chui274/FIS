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
 * @author sofiafernandezmoreno
 */
public class PlanAlquiler {
    private boolean visible;
    private Date primerDiaAlquiler;
    private Date ultimoDiaAlquiler;
    private double costeAlquilerAlDial;
    private String ciudadRecogida;
    
    
     PlanAlquiler(String nombreUsuario, String contraseña, String direccionCorreo) {
      this.nombreUsuario= nombreUsuario;
      this.contraseña = contraseña;
      this.direccionCorreo = direccionCorreo;
    }
    protected ArrayList<String> obtenerDatosPA(){}
    crear(unVehículo : Vehículo, fechaInicio : date, fechaFin : date, ciudadRecogida : string) ~eliminarVehículo()
~obtenerDatosPlanAlquiler() : List
~modificarVisibilidad(visible : boolean)
    
}
