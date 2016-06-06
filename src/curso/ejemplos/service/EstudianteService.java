package curso.ejemplos.service;

import java.util.List;

import curso.ejemplos.bean.Estudiante;

public interface EstudianteService {
	
	public void registrar(Estudiante estudiante) throws Exception;

	public List<Estudiante> obtenerTodos() throws Exception;

	public void matricularEnGrupo(Estudiante estudiante, Integer idGrupo)
			throws Exception;
}
