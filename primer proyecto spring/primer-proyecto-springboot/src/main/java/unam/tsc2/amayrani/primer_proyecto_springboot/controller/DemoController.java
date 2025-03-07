package unam.tsc2.amayrani.primer_proyecto_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import unam.tsc2.amayrani.primer_proyecto_springboot.model.Producto;
import unam.tsc2.amayrani.primer_proyecto_springboot.repo.IProductoRepo;

@Controller
public class DemoController {

	@Autowired
	private IProductoRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
		
		Producto p = new Producto();
		p.setIdProducto(1);
		p.setNombre("Paleta");
		p.setMarca("Vero");
		repo.save(p);
		
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting(Model model){

		model.addAttribute("productos", repo.findAll());
		return "greeting";
	}
	
}
