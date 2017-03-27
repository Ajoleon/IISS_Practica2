package ujaen.ingservicios.org;
import java.sql.Connection;
import java.sql.DriverManager;

public class UsuarioDTO {
	String user;
	String email;
	String dir;
	String tlf;
	String pass;
	public UsuarioDTO(String user,String pass, String email, String dir, String tlf) {
		super();
		this.user = user;
		this.pass = pass;
		this.email = email;
		this.dir = dir;
		this.tlf = tlf;
	}
	
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
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
