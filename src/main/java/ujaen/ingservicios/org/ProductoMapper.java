package ujaen.ingservicios.org;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class ProductoMapper implements RowMapper<ProductoDTO> {
	public ProductoDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
		ProductoDTO producto = new ProductoDTO("","","","",""); 
		producto.setNombre(rs.getString("Nombre"));
		producto.setPrecio(rs.getString("Precio"));
		producto.setImagen(rs.getString("Imagen"));
		producto.setId(rs.getString("ID"));
		return producto;
	} 
	
}
