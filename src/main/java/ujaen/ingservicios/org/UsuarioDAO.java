package ujaen.ingservicios.org;

import java.util.List;

public interface UsuarioDAO {
 public List<UsuarioDTO>leeUsuarios();
 public void NuevoUsuario(UsuarioDTO usuario);
 public UsuarioDTO LeerEmail(int Email);
 public UsuarioDTO LeerNombre(int Nombre);
 
}
