package curso.ejemplos.service.impl;

import java.util.List;

import curso.ejemplos.bean.Grupo;
import curso.ejemplos.dao.GrupoDao;
import curso.ejemplos.service.GrupoService;

public class GrupoServiceImpl implements GrupoService{

	private GrupoDao grupoDao = null;
	
	public void registrarGrupo(Grupo grupo) throws Exception {
		grupoDao.attachDirty(grupo);
	}
	
	public List<Grupo> obtenerTodos() throws Exception {
		return grupoDao.loadAll();
	}
	
	
	
	/* constructor */
	public GrupoServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	/* setters y getters */
	
	public GrupoDao getGrupoDao() {
		return grupoDao;
	}

	public void setGrupoDao(GrupoDao grupoDao) {
		this.grupoDao = grupoDao;
	}

}
