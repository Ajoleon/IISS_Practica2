package ujaen.ingservicios.org;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
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
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	/*A partir de aqui lo hemos empezado a implementar nosotros*/
	
	@RequestMapping(value = "/Aquiponernombre", method = RequestMethod.POST)
	public String aquiponernombre(HttpServletRequest req, Model mod) {
		String user = req.getParameter("Usuario");
	    String email = req.getParameter("Email");
	    String dir = req.getParameter("Direccion");
	    String tlf = req.getParameter("Telefono");
}
	
}
