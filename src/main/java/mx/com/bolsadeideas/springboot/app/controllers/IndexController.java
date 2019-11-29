package mx.com.bolsadeideas.springboot.app.controllers;

import mx.com.bolsadeideas.springboot.app.models.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/app")
public class IndexController {
	@GetMapping({"/index", "/home","/"})
	public String index(Model model){
		model.addAttribute("titulo", "¡Probando el Framework!");
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'a las' HH:mm:ss");
		Date date = new Date(System.currentTimeMillis());

		System.out.println("Se prueba acceso http://localhost:8080/app/ el " + formatter.format(date) );
		return "index";
	}

	@RequestMapping("/perfil")
	public String perfil(Model model){
		Usuario usuario = new Usuario();
		usuario.setNonbre("Jonathan");
		usuario.setApellido("Nicio");

		model.addAttribute("usuario",usuario);
		model.addAttribute("titulo", "Perfil de Usuario: ".concat(usuario.getNonbre()));

		return "perfil";
	}
}
