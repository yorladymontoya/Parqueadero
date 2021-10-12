
package parqueadero;

import parqueaderoControladores.ControladorInicio;
import parqueaderoModelos.ModeloInicio;
import parqueaderoVistas.VistaInicio;


public class Parqueadero {

    public static void main(String[] args) {
   ModeloInicio modeloIni = new ModeloInicio();
   VistaInicio vistaIni = new VistaInicio();
   vistaIni.setVisible(true);
   ControladorInicio controladorIni = new ControladorInicio(modeloIni, vistaIni);
    
 
    }
    
}
