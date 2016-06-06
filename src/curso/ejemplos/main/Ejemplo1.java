package curso.ejemplos.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import curso.ejemplos.bean.Estudiante;
import curso.ejemplos.bean.Grupo;
import curso.ejemplos.service.EstudianteService;
import curso.ejemplos.service.GrupoService;

/**
 * Ejemplo de la integración Spring-Hibernate.
 */
public class Ejemplo1 {

	/**
	 * Se registra un estudiante y un grupo.
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

		// crear un Estudiante de forma estática. (solo con el fin de hacer las
		// cosas simples en este ejemplo)
		Estudiante estudiante = crearEstudiante();
		// crear un Grupo de forma estática. (solo con el fin de hacer las
		// cosas simples en este ejemplo)
		Grupo grupo = crearGrupo();

		// ejecutar los métodos de negocio que registran al estudiante y al
		// grupo.
		try {
			estudianteService.registrar(estudiante);
			grupoService.registrarGrupo(grupo);
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}

	/**
	 * Crea un estudiante de forma estática. Está hecho con el fin de hacer las
	 * cosas simples en este ejemplo.
	 * 
	 * @return un objeto estudiante
	 */
	public static Estudiante crearEstudiante() {
		Estudiante estudiante = new Estudiante();
		estudiante.setCI("84031185477");
		estudiante.setEdad(27);
		estudiante.setNombre("Pepe");
		estudiante.setPrimerApellido("Pérez");
		estudiante.setSegundoApellido("Pérez");
		return estudiante;
	}

	/**
	 * Crea un grupo de forma estática. Está hecho con el fin
	 * de hacer las cosas simples en este ejemplo.
	 * 
	 * @return un objeto estudiante
	 */
	public static Grupo crearGrupo() {		
		Grupo grupo = new Grupo();
		grupo.setNumero("8201");
		grupo.setFacultad(8);				
		return grupo;
	}

}
