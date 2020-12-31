
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;


public class usuario {

    //Atributos
    private int idusuario;
    private String nombre;
    private String apellido;
    private String imagen;

    Conexion conn ;
    //Cosntructor
    public usuario() {
        
    }
    public usuario(int idusuario, String nombre, String apellido, String imagen) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.imagen = imagen;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getImagen() {
        return imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
   
    public usuario(Conexion conn) {
        this.conn = conn;
    }

    public LinkedList<usuario> ListarUsuarios(){
       String query = "select * from usuario";
       LinkedList<usuario> lista; 
        try{
            
            Statement sentencia = conn.getConnection().createStatement();
            ResultSet resultado = sentencia.executeQuery(query);
            
            lista= new LinkedList<usuario>();

            while(resultado.next()){
                
                usuario u = new usuario();
                u.setIdusuario(resultado.getInt("idusuario"));
                u.setNombre(resultado.getString("nombres"));
                u.setApellido(resultado.getString("apellidos"));
                u.setImagen(resultado.getString("imagenusuario"));
                lista.add(u);
            }
              resultado.close(); // cerrando 
              sentencia.close();  // cerrando 
            return lista;
            
        }catch(Exception ex){
            System.out.print("problemas en conexion ");
        }finally {
             conn.desconectar(); // termina la conexion 
        }
        return null;
    }
}
