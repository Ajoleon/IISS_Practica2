package ujaen.ingservicios.org;

public class UsuarioDAOjdbc implements UsuarioDAO {

	public List<Usuario> leeUsuarios(){
		
		/*CONEXION CON LA BASE DE DATOS*/
		String sql= "select * from usuarios";
		UsuarioMapper mapper= new UsuarioMapper();
		List<Usuario> usuarios= this.jdbcTemplate.query(sql, mapper);
		return usuarios;
		
	}
    
	public String muestraJSP(){
		return "muestra JSP";
	}
}
