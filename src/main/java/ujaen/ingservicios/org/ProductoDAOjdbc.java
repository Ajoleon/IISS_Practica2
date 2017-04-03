package ujaen.ingservicios.org;

import java.util.List;

import javax.sql.DataSource;

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
	
	public UsuarioDTO LeerEmail(int Email){ //Devuelve el usuario buscado o null si no existe
		String sql = "select * from usuarios where Email = ?";
		Object[ ] parametros = {Email}; //Array de objetos
		UsuarioMapper mapper = new UsuarioMapper();
		List<UsuarioDTO> usuarios = this.jdbcTemplate.query(sql, parametros, mapper);
		if (usuarios.isEmpty()) return null;
		else return usuarios.get(0);
		}
	public UsuarioDTO LeerNombre(int Nombre){
		String sql = "select * from usuarios where Nombre = ?";
		Object[ ] parametros = {Nombre}; 
		UsuarioMapper mapper = new UsuarioMapper();
		List<UsuarioDTO> usuarios = this.jdbcTemplate.query(sql, parametros, mapper);
		if (usuarios.isEmpty()) return null;
		else return usuarios.get(0);
	}
	
	public List<UsuarioDTO> leeUsuarios(){
		String sql = "select * from usuarios";
		UsuarioMapper mapper = new UsuarioMapper();
		List<UsuarioDTO> usuarios = this.jdbcTemplate.query(sql, mapper);
		return usuarios;
		}

}
