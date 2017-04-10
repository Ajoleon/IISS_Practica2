package ujaen.ingservicios.org;

import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class ProductoDAOjdbc implements ProductoDAO{
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	
	public void NuevoProducto(ProductoDTO producto){
		String sql = "insert into productos values(?,?,?)";
		Object[] parametros = {producto.getNombre(),producto.getPrecio(),producto.getImagen()};
		this.jdbcTemplate.update(sql,parametros);
		}
	
	public void BajaProducto(int ID){
		String sql = "delete from productos where ID = ?";
		Object[] parametros = {ID};
		this.jdbcTemplate.update(sql,parametros);
		}
	
	public ProductoDTO LeerID(int ID){
		String sql = "select * from productos where Nombre = ?";
		Object[ ] parametros = {ID}; 
		ProductoMapper mapper = new ProductoMapper();
		List<ProductoDTO> productos = this.jdbcTemplate.query(sql, parametros, mapper);
		if (productos.isEmpty()) return null;
		else return productos.get(0);
	}
	
	public ProductoDTO LeerNombre(String Nombre){
		String sql = "select * from productos where Nombre = ?";
		Object[ ] parametros = {Nombre}; 
		ProductoMapper mapper = new ProductoMapper();
		List<ProductoDTO> productos = this.jdbcTemplate.query(sql, parametros, mapper);
		if (productos.isEmpty()) return null;
		else return productos.get(0);
	}
	
	public List<ProductoDTO> leeProductos(){
		String sql = "select * from productos";
		ProductoMapper mapper = new ProductoMapper();
		List<ProductoDTO> productos = this.jdbcTemplate.query(sql, mapper);
		return productos;
		}

}
