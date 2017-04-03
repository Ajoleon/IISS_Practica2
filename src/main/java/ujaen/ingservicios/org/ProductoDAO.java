package ujaen.ingservicios.org;

import java.util.List;

public interface ProductoDAO {
	 public List<ProductoDTO>leeProductos();
	 public void NuevoProducto(ProductoDTO producto);
	 public void BajaProducto(int ID);
	 public ProductoDTO LeerID(int ID);
	 public ProductoDTO LeerNombre(String Nombre); 
}
