package ujaen.ingservicios.org;
import java.sql.Connection;
import java.sql.DriverManager;

public class UsuarioDTO {
	String Nombre;
	String email;
	String dir;
	String tlf;
	String pass;
	
	public UsuarioDTO(String nombre, String email, String dir, String tlf, String pass) {
		super();
		this.Nombre = nombre;
		this.email = email;
		this.dir = dir;
		this.tlf = tlf;
		this.pass = pass;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	
}
