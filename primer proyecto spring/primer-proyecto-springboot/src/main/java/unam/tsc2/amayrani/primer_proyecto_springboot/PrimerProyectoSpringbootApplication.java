package unam.tsc2.amayrani.primer_proyecto_springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerProyectoSpringbootApplication implements CommandLineRunner{

	private static Logger LOG = LoggerFactory.getLogger(PrimerProyectoSpringbootApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		LOG.info("prueba");
	}

}
