
package parqueaderoModelos;

import java.sql.Connection;
import java.sql.DriverManager;


public class ModeloInicio {
    
    private  String servidor = "jdbc:mysql://localhost/parqueadero";
    private String usuario = "root";
    private String password="";
    
    
    public ModeloInicio() {
    }
    
      public Connection conectarBD(){
       
       Connection conexion=null;
       try {
           
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexion=DriverManager.getConnection(servidor, usuario, password);
           
           System.out.println("Conexion exitosa");
           return conexion;
           
       } catch (Exception error) {
           
            System.out.println("No se pudo conectar a la base de datos por favor intente de nuevo" +  error);
           return null;
       }
   }
    
    
    
}
