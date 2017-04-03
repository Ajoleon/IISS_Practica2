package ujaen.ingservicios.org;

import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import javax.sql.DataSource;
public class UsuarioDAOjdbc implements UsuarioDAO {
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource); 
	}
	public void NuevoUsuario(UsuarioDTO usuario){
		String sql = "insert into usuarios values(?,?,?,?,?)";
		Object[] parametros = {usuario.getNombre(),usuario.getPass(),usuario.getEmail(),usuario.getDireccion(),usuario.getTelefono()};
		this.jdbcTemplate.update(sql,parametros);
		}
	
	public UsuarioDTO LeerEmail(String Email){ //Devuelve el usuario buscado o null si no existe
		String sql = "select * from usuarios where Email = ?";
		Object[ ] parametros = {Email}; //Array de objetos
		UsuarioMapper mapper = new UsuarioMapper();
		List<UsuarioDTO> usuarios = this.jdbcTemplate.query(sql, parametros, mapper);
		if (usuarios.isEmpty()) return null;
		else return usuarios.get(0);
		}
	public UsuarioDTO LeerNombre(String Nombre){
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
