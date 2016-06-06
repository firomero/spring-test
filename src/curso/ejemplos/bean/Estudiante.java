package curso.ejemplos.bean;

public class Estudiante implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;

	private Grupo grupo;

	private String segundoApellido;

	private String primerApellido;

	private String nombre;

	private String CI;

	private Integer edad;

	// Constructors

	/** default constructor */
	public Estudiante() {
	}

	/** constructor with id */
	public Estudiante(Integer id) {
		this.id = id;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}

	public String getSegundoApellido() {
		return this.segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getPrimerApellido() {
		return this.primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCI() {
		return this.CI;
	}

	public void setCI(String CI) {
		this.CI = CI;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Estudinate::").append(id).append("-[").append(nombre)
				.append(" ").append(primerApellido).append(" ").append(
						segundoApellido).append(". CI: ").append(CI).append(
						". Edad: ").append(edad).append("]");
		return sb.toString();
	}
}