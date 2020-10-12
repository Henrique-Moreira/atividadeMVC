package com.atividade.atividadeBootstrap.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controlador {
	@RequestMapping("/")
	public String paginaUm() {
		return "pagina1";
	}
	@RequestMapping("/p2")
	public String paginaDois() {
		return "pagina2";
	}
}
