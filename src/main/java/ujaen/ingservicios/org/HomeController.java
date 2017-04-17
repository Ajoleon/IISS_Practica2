package ujaen.ingservicios.org;

import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



/***
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);	
	
	@Autowired 
	UsuarioDAO dao; 
	@Autowired
	ProductoDAO dao1;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req, Model model) {
		Cookie[ ] cookies = req.getCookies( );
		String cookieName ="emailCookie";
		String emailAddress = "";
		HttpSession session = req.getSession(true);
		if(cookies!=null){
			for(Cookie cookie:cookies){
				if (cookieName.equals(cookie.getName())) 
					emailAddress = cookie.getValue();
			}
		}
		if(emailAddress.equals("")){
			//para iniciar o registrarse
			return "index";
		}else{
		
			UsuarioDTO usuario = dao.LeerEmail(emailAddress);
			if(usuario != null){
				session.setAttribute("usuario", usuario);
				HashMap itemsGuardados = new HashMap();
				session.setAttribute("carrito", itemsGuardados);
				int total = 0;
				session.setAttribute("total", total);
				return "shop";
			}else{
				session.setAttribute("mensaje", "");
				return "index";
			}
		}
		
	}
	@RequestMapping(value = "/Index", method = RequestMethod.POST)
	public String Index(HttpServletRequest req,HttpServletResponse res, Model model) {
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		HttpSession session = req.getSession(true);
		if(user.equals("admin") && pass.equals("admin")){
		
			List<UsuarioDTO> lista = dao.leeUsuarios();
			session.setAttribute("listado", lista);
			session.setAttribute("name","administrador");
			
			return "Admin";
		}else{ 
			//buscar el base de datos
			//si existe, devuelvo shop, si no, sigo igual
			
			UsuarioDTO usuario = dao.LeerNombre(user);
			if(usuario != null){
				if(usuario.getPass().equals(pass)){
					session.setAttribute("usuario", usuario);
					session.setAttribute("total",0);
					HashMap itemsGuardados = new HashMap();
					Cookie c = new Cookie("emailCookie",usuario.getEmail()); 
					c.setMaxAge(60*60*24*365*2);
					c.setPath("/");
					res.addCookie(c);
					session.setAttribute("carrito", itemsGuardados);
					return "shop";
				}else{
					session.setAttribute("mensaje1", "Error, contraseña incorrecta");
					return "index";
				}
			}else{
				session.setAttribute("mensaje1", "Usuario no válido");
				return "index";
			}
			
		}
	}
	@RequestMapping(value = "/Shop", method = RequestMethod.GET)
	public String Shop(HttpServletRequest req, Model model) {

		return "shop";
	}
	@RequestMapping(value = "/Registro", method = RequestMethod.GET)
	public String Registro(HttpServletRequest req, Model model) {

		return "registro";
	}
	@RequestMapping(value = "/Nuevo", method = RequestMethod.POST)
	public String Nuevo(HttpServletRequest req,HttpServletResponse res, Model model) {
		String user = req.getParameter("nombre");
		String pass =req.getParameter("pass");
		String tlf = req.getParameter("tlf");
		String dir = req.getParameter("dir");
		String email = req.getParameter("email");
		HttpSession session = req.getSession(true );
		
		//buscar en base de datos si existe con email y nombre de usuario, si no
		//almacenar en base de datos
		//si existe, devuelvo registro de nuevo
		
		UsuarioDTO usuario = dao.LeerEmail(email);
		if(usuario != null){
			session.setAttribute("mensaje2", "Error, email ya existente");
			return "registro";
		}else{
			usuario = dao.LeerNombre(user);
			if(usuario != null){
				session.setAttribute("mensaje2", "Error, usuario ya existente");
				return "registro";
			}else{
				usuario = new UsuarioDTO (user,email,dir,tlf,pass);
				dao.NuevoUsuario(usuario);
				session.setAttribute("usuario", usuario);
				session.setAttribute("total", 0);
				Cookie c = new Cookie("emailCookie", email); 
				c.setMaxAge(60*60*24*365*2);
				HashMap itemsGuardados = new HashMap();
				session.setAttribute("carrito", itemsGuardados);
				session.setAttribute("total", 0);
				c.setPath("/");
				res.addCookie(c);
				return "shop";
			}
		}
		
	}
	@RequestMapping(value = "/Suma/{param}", method = RequestMethod.POST)
	public String Suma(HttpServletRequest req,@PathVariable(value="param") int id, Model model) {
		HttpSession session = req.getSession(true );
		int total =  (Integer) session.getAttribute("total");
		HashMap itemsGuardados = (HashMap) session.getAttribute("carrito");
		ProductoDTO producto = (ProductoDTO) itemsGuardados.get(id);
		if(producto != null){
			producto.setCantidad(String.valueOf(Integer.parseInt(producto.getCantidad())+1));
			total = total + Integer.parseInt(producto.getPrecio());
			itemsGuardados.put(id, producto);
		}else{
			producto = dao1.LeerID(id);
			producto.setCantidad("1");
			itemsGuardados.put(id, producto);
			total = total + Integer.parseInt(producto.getPrecio());
		}
		session.setAttribute("carrito", itemsGuardados);
		session.setAttribute("total", total);
		return "cart";
	}
	@RequestMapping(value = "/Resta/{param}", method = RequestMethod.POST)
	public String Resta(HttpServletRequest req,@PathVariable(value="param") int id, Model model) {
		
		HttpSession session = req.getSession(true );
		int total =  (Integer) session.getAttribute("total");
		HashMap itemsGuardados = (HashMap) session.getAttribute("carrito");
		ProductoDTO res = (ProductoDTO) itemsGuardados.get(id);
		itemsGuardados.remove(id);
		total = total - (Integer.parseInt(res.getCantidad())*Integer.parseInt(res.getPrecio()));
		session.setAttribute("carrito", itemsGuardados);
		session.setAttribute("total", total);
		return "cart";
	}
	@RequestMapping(value = "/Cart", method = RequestMethod.GET)
	public String Cart(HttpServletRequest req, Model model) {

		return "cart";
	}
	@RequestMapping(value = "/Perfil", method = RequestMethod.GET)
	public String Perfil(HttpServletRequest req, Model model) {

		return "perfil";
	}
	@RequestMapping(value = "/Cambio", method = RequestMethod.GET)
	public String Cambio(HttpServletRequest req, Model model) {

		return "cambio";
	}
	@RequestMapping(value = "/User", method = RequestMethod.POST)
	public String User(HttpServletRequest req, Model model) {
		String user = req.getParameter("nombre");
		UsuarioDTO usuario = dao.LeerNombre(user);
		HttpSession session = req.getSession(true );

		if(usuario != null){
			return "cambio";
		}else{
			usuario = (UsuarioDTO) session.getAttribute("usuario");
			dao.BorrarUsuario(usuario.getEmail());
			usuario.setNombre(user);
			dao.NuevoUsuario(usuario);
			session.setAttribute("usuario", usuario);
			return "perfil";
		}
	}
	@RequestMapping(value = "/Pass", method = RequestMethod.POST)
	public String Pass(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession(true );
		String pass = req.getParameter("pass");
		UsuarioDTO usuario = (UsuarioDTO) session.getAttribute("usuario");
		dao.BorrarUsuario(usuario.getEmail());
		usuario.setPass(pass);
		dao.NuevoUsuario(usuario);
		session.setAttribute("usuario", usuario);
		return "perfil";
	}
	@RequestMapping(value = "/Email", method = RequestMethod.POST)
	public String Email(HttpServletRequest req,HttpServletResponse res, Model model) {

		String email = req.getParameter("email");
		UsuarioDTO usuario = dao.LeerEmail(email);
		HttpSession session = req.getSession(true );

		if(usuario != null){
			return "cambio";
		}else{
			usuario = (UsuarioDTO) session.getAttribute("usuario");
			dao.BorrarUsuario(usuario.getEmail());
			usuario.setEmail(email);
			dao.NuevoUsuario(usuario);
			Cookie c = new Cookie("emailCookie", email); 
			c.setMaxAge(60*60*24*365*2);
			c.setPath("/");
			res.addCookie(c);
			session.setAttribute("usuario", usuario);
			return "perfil";
		}
	}
	@RequestMapping(value = "/Dir", method = RequestMethod.POST	)
	public String Dir(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession(true );
		String dir = req.getParameter("dir");
		UsuarioDTO usuario = (UsuarioDTO) session.getAttribute("usuario");
		dao.BorrarUsuario(usuario.getEmail());
		usuario.setDir(dir);
		dao.NuevoUsuario(usuario);
		session.setAttribute("usuario", usuario);
		return "perfil";
	}
	@RequestMapping(value = "/Tlf", method = RequestMethod.POST)
	public String Tlf(HttpServletRequest req, Model model) {
		HttpSession session = req.getSession(true );
		String tlf = req.getParameter("tlf");
		UsuarioDTO usuario = (UsuarioDTO) session.getAttribute("usuario");
		dao.BorrarUsuario(usuario.getEmail());
		usuario.setPass(tlf);
		dao.NuevoUsuario(usuario);
		session.setAttribute("usuario", usuario);
		return "perfil";
	}
	@RequestMapping(value = "/Logout", method = RequestMethod.GET)
	public String Logout(HttpServletRequest req,HttpServletResponse res, Model model) {
		HttpSession session = req.getSession(true);
		session.invalidate();
		Cookie c = new Cookie("emailCookie", ""); 
		c.setMaxAge(60*60*24*365*2);
		c.setPath("/");
		res.addCookie(c);
		return "index";
	}
}
