package unam.tsc2.amayrani.primer_proyecto_springboot.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import unam.tsc2.amayrani.primer_proyecto_springboot.model.Producto;
import unam.tsc2.amayrani.primer_proyecto_springboot.repo.IProductoRepo;

@RestController
@RequestMapping("/productos")
public class RestDemoController {

	@Autowired
	private IProductoRepo repo;
	
	@GetMapping//1
	public List<Producto> listar(){
		return repo.findAll();
	}
	
	@PostMapping//2
	public void insertar(@RequestBody Producto p){
		repo.save(p);
	}
	
	@PutMapping//3
	public void modificar(@RequestBody Producto p) {
		repo.save(p);
	}
	
	@PatchMapping//4
	public void corregir(@RequestBody Producto p) {
		repo.save(p).setMarca(p.getMarca());;
	}
	
	@DeleteMapping(value="/{id}")//5
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
}
