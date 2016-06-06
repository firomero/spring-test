package curso.ejemplos.bean;

import java.util.HashSet;
import java.util.Set;

public class Grupo implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private String numero;

	private Integer facultad;

	private Set<Estudiante> estudiantes;

	public void adicionarEstudiante(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}

	// Constructors

	/** default constructor */
	public Grupo() {
		estudiantes = new HashSet<Estudiante>();
	}

	/** constructor with id */
	public Grupo(Integer id) {
		this.id = id;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getFacultad() {
		return this.facultad;
	}

	public void setFacultad(Integer facultad) {
		this.facultad = facultad;
	}

	public Set<Estudiante> getEstudiantes() {
		return this.estudiantes;
	}

	public void setEstudiantes(Set<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Grupo::").append(id).append("-[").append("Número: ").append(
				numero).append(" Facultad: ").append(facultad).append("]");
		return sb.toString();
	}

}