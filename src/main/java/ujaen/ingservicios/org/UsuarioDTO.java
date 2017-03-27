package ujaen.ingservicios.org;
import java.sql.Connection;
import java.sql.DriverManager;

public class UsuarioDTO {
	String user;
	String email;
	String dir;
	String tlf;
	public UsuarioDTO(String user, String email, String dir, String tlf) {
		super();
		this.user = user;
		this.email = email;
		this.dir = dir;
		this.tlf = tlf;
	}
	
	public String getNombre( ){
	    return this.user;
	  }
	public void setNombre(String user){
	    this.user = user;
	  }
	public String getEmail( ){
	    return this.email;
	  }
	public void setEmail(String email){
	    this.email = email;
	  }	
	public String getDireccion( ){
	    return this.dir;
	  }
	public void setDireccion(String dir){
	    this.dir = dir;
	  }
	public String getTelefono( ){
	    return this.tlf;
	  }
	public void setTelefono(String tlf){
	    this.tlf = tlf;
	  }
	
}
