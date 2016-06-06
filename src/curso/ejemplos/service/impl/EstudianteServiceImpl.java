package curso.ejemplos.service.impl;

import java.util.List;

import curso.ejemplos.bean.Estudiante;
import curso.ejemplos.bean.Grupo;
import curso.ejemplos.dao.EstudianteDao;
import curso.ejemplos.service.EstudianteService;

public class EstudianteServiceImpl implements EstudianteService {

	private EstudianteDao estudianteDao = null;

	public void registrar(Estudiante estudiante) throws Exception {
		estudianteDao.attachDirty(estudiante);
	}

	public void matricularEnGrupo(Estudiante estudiante, Integer idGrupo)
			throws Exception {
		estudiante.setGrupo(new Grupo(idGrupo));
	}

	public List<Estudiante> obtenerTodos() throws Exception {
		return estudianteDao.loadAll();
	}

	/* constructor */
	public EstudianteServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* setters y getters */

	public EstudianteDao getEstudianteDao() {
		return estudianteDao;
	}

	public void setEstudianteDao(EstudianteDao estudianteDao) {
		this.estudianteDao = estudianteDao;
	}

}
