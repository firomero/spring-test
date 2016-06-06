package curso.ejemplos.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import curso.ejemplos.bean.Estudiante;
import curso.ejemplos.bean.Grupo;
import curso.ejemplos.service.EstudianteService;
import curso.ejemplos.service.GrupoService;

/**
 * Ejemplo de la integración Spring-Hibernate.
 */
public class Ejemplo2 {

	/**
	 * Muestra todos los estudiantes y grupos registrados en el sistema.
	 */
	public static void main(String[] args) {
		// crear el application context de Spring a partir de los XML de
		// configuracion.
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "spring_config/appContext.xml",
						"spring_config/hibernate.xml" });
		// obtener el servicio (objeto de negocio) encargado de las operaciones
		// de negocio sobre las entidades Estudiante
		EstudianteService estudianteService = (EstudianteService) applicationContext
				.getBean("estudianteService");
		// obtener el servicio (objeto de negocio) encargado de las operaciones
		// de negocio sobre las entidades Grupo
		GrupoService grupoService = (GrupoService) applicationContext
				.getBean("grupoService");
		
		List<Grupo> grupos = null;
		List<Estudiante> estudiantes = null;
		
		// ejecutar el método de negocio que registra al estudiante.
		try {
			grupos = grupoService.obtenerTodos();
			estudiantes = estudianteService.obtenerTodos();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("-------- TODOS LOS GRUPOS ----------");
		for(Grupo g : grupos)
			System.out.println(g);
		System.out.println("------------------------------------");
		System.out.println("-------- TODOS LOS ESTUDIANTES ----------");
		for(Estudiante e : estudiantes)
			System.out.println(e);
		System.out.println("-----------------------------------------");

	}

}
