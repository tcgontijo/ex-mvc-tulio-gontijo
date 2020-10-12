package com.tuliogontijo.demo.aplicaocao.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo {

	@RequestMapping("/")
	public String pag1() {
		return "pagina1";
	}
	
	@RequestMapping("/2")
	public String pag2() {
		return "pagina2";
	}
}
