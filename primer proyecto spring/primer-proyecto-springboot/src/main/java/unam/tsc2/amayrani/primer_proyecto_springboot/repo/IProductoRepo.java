package unam.tsc2.amayrani.primer_proyecto_springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import unam.tsc2.amayrani.primer_proyecto_springboot.model.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

	
}
