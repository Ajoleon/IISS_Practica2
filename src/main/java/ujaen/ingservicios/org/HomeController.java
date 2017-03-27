package ujaen.ingservicios.org;

import java.text.DateFormat;
import java.util.Date;
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/***
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);	
	
 /*	@Autowired
	UsuarioDAO dao;
	@RequestMapping(value = "/Usuario", method = RequestMethod.GET)
	public String versiondao(Model model) {
		String version = dao.muestraVersion();
		model.addAttribute("version", version );
		return "versionDAO";
	}*/
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest req, Model model) {
		Cookie[ ] cookies = req.getCookies( );
		String cookieName ="emailCookie";
		String emailAddress = "";
		if(cookies!=null){
			for(Cookie cookie:cookies){
				if (cookieName.equals(cookie.getName())) 
					emailAddress = cookie.getValue();
			}
		}
		if(emailAddress.equals("")){
			//Busco base de datos usuario
			return "shop";
		}else{
			return "index";
		}
		
	}
	@RequestMapping(value = "/Registro", method = RequestMethod.GET)
	public String Registro(HttpServletRequest req,HttpServletResponse res, Model model) {
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		if(user.equals("admin") && pass.equals("admin")){
			HttpSession session = req.getSession(true);
			session.setAttribute("name","administrador");
			
			return "Admin";
		}else{ 
			//buscar el base de datos
			//si existe, devuelvo shop, si no, sigo igual
			return "Registro";
		}
	}
	@RequestMapping(value = "/Shop", method = RequestMethod.GET)
	public String Shop(HttpServletRequest req, Model model) {

		return "shop";
	}
	@RequestMapping(value = "/Nuevo", method = RequestMethod.GET)
	public String Nuevo(HttpServletRequest req,HttpServletResponse res, Model model) {
		String user = req.getParameter("nombre");
		String pass =req.getParameter("user");
		String tlf = req.getParameter("tlf");
		String dir = req.getParameter("dir");
		String email = req.getParameter("email");
		HttpSession session = req.getSession(true );
		Cookie c = new Cookie("emailCookie", email); 
		c.setMaxAge(60*60*24*365*2);
		c.setPath("/org/");
		res.addCookie(c);
		UsuarioDTO usuario  = new UsuarioDTO(user,pass,email,dir,tlf);
		//buscar en base de datos si existe con email, si no
		//almacenar en base de datos
		//si existe, devuelvo Nuevo de nuevo
		session.setAttribute("usuario", usuario);
		session.setAttribute("total", 0);
		return "shop";
	}
	
	
}
