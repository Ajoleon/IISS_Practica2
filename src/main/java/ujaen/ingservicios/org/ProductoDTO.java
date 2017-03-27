package ujaen.ingservicios.org;
import java.sql.Connection;
import java.sql.DriverManager;
public class ProductoDTO {
	String nombre;
	String precio;
	String cantidad;
	
    public ProductoDTO(String nombre, String precio){
	 super();
	  this.nombre=nombre;
	  this.precio=precio;
}
    public String getNombre(){
      return this.nombre;
  }
    public void setNombre(String nombre){
      this.nombre = nombre;
  }
    public String getPrecio(){
      return this.precio;
  }
    public void setPrecio(String precio){
      this.precio = precio;
  }
    public String getCantidad(){
        return this.cantidad;
    }
      public void setCantidad(String cantidad){
        this.cantidad = cantidad;
    }
}
