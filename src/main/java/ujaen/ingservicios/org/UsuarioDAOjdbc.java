package ujaen.ingservicios.org;

public class UsuarioDAOjdbc implements UsuarioDAO {
    
	public void NuevoUsuario(UsuarioDTO usuario){
		String sql = "insert into usuarios values(?,?,?,?,?)";
		Object[] parametros = {usuario.getNombre(),usuario.getPass(),usuario.getEmail(),usuario.getDireccion(),usuario.getTelefono()};
		this.jdbcTemplate.update(sql,parametros);
		}
	
	public UsuarioDTO LeerEmail(int Email){ //Devuelve el usuario buscado o null si no existe
		String sql = "select * from usuarios where Email = ?";
		Object[ ] parametros = {Email}; //Array de objetos
		UsuarioMapper mapper = new UsuarioMapper();
		List<Usuario> usuarios = this.jdbcTemplate.query(sql, parametros, mapper);
		if (usuarios.isEmpty()) return null;
		else return usuarios.get(0);
		}
	public UsuarioDTO LeerNombre(int Nombre){
		String sql = "select * from usuarios where Nombre = ?";
		Object[ ] parametros = {Nombre}; 
		UsuarioMapper mapper = new UsuarioMapper();
		List<Usuario> usuarios = this.jdbcTemplate.query(sql, parametros, mapper);
		if (usuarios.isEmpty()) return null;
		else return usuarios.get(0);
	}
	
	public List<Usuario> LeerTodos(){
		String sql = "select * from usuarios";
		UsuarioMapper mapper = new UsuarioMapper();
		List<Usuario> usuarios = this.jdbcTemplate.query(sql, mapper);
		return usuarios;
		}
}
