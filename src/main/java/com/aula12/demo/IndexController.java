package com.aula12.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.aula12.Calculadora;

@Controller
public class IndexController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}

	@GetMapping("/p1")
	public String pagina1(){
		return "pagina1";
	}

	@GetMapping("/p2")
	public String pagina2(){
		return "pagina2";
	}

	@GetMapping("/calc")
	public String calcular(Model model){
		model.addAttribute("calculadora",new Calculadora());
		return "calc";
	}

	@GetMapping("/resultado")
	public String resultado(@ModelAttribute Calculadora calc,Model model){
		model.addAttribute("s", calc.somar());
		return "resultado";
	}
	
}
