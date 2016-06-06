package curso.ejemplos.service;

import java.util.List;

import curso.ejemplos.bean.Grupo;

public interface GrupoService {
	public void registrarGrupo(Grupo grupo) throws Exception;
	public List<Grupo> obtenerTodos() throws Exception;
}
