package ujaen.ingservicios.org;
import java.sql.Connection;
import java.sql.DriverManager;
public class ProductoDTO {
	String nombre;
	String precio;
	String cantidad;
	String imagen;
	String id;
	
    public ProductoDTO(String nombre, String precio, String cantidad, String imagen,String ID){
	 super();
	  this.nombre=nombre;
	  this.precio=precio;
	  this.cantidad=cantidad;
	  this.imagen=imagen;
	  this.id=ID;
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
      public String getImagen(){
          return this.imagen;
      }
        public void setImagen(String imagen){
          this.imagen = imagen;
      } 
        public String getId(){
            return this.id;
        }
          public void setId(String ID){
            this.id = ID;
        }
}
