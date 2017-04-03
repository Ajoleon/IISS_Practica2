package ujaen.ingservicios.org;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class UsuarioMapper implements RowMapper<UsuarioDTO> {
	public UsuarioDTO mapRow(ResultSet rs, int rowNum) throws SQLException{
		UsuarioDTO usuario = new UsuarioDTO("","","","",""); 
		usuario.setNombre(rs.getString("Nombre"));
		usuario.setDireccion(rs.getString("Dirección"));
		usuario.setTelefono(rs.getString("Teléfono"));
		usuario.setEmail(rs.getString("Email"));
		usuario.setPass(rs.getString("Pass"));
		return usuario;
	} 
	
}
