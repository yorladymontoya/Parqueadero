
package parqueaderoControladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import parqueaderoModelos.ModeloInicio;
import parqueaderoVistas.VistaInicio;


public class ControladorInicio implements ActionListener{
    
     ModeloInicio modeloIni = new ModeloInicio();
     VistaInicio vistaIni = new VistaInicio();
     
    
     public ControladorInicio(ModeloInicio modeloIni, VistaInicio vistaIni ) {
        
        this.modeloIni = modeloIni;
        this.vistaIni=vistaIni;
        vistaIni.BotonConsultar.addActionListener(this);
        
    }
 
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        modeloIni.conectarBD();
    }
    
  
}
