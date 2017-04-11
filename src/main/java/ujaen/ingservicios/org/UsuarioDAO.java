package ujaen.ingservicios.org;

import java.util.List;

public interface UsuarioDAO {
 public List<UsuarioDTO>leeUsuarios();
 public void NuevoUsuario(UsuarioDTO usuario);
 public UsuarioDTO LeerEmail(String Email);
 public UsuarioDTO LeerNombre(String Nombre);
 public void BorrarUsuario(String email);
}
