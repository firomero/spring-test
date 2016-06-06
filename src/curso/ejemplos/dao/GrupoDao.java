package curso.ejemplos.dao;

import java.util.List;

import curso.ejemplos.bean.Grupo;

public interface GrupoDao {

	/**
	 * Craga todos los objetos de la clase Grupo
	 */
	public List loadAll();

	/**
	 * Hace persistente un objeto Grupo
	 * 
	 * @param transientInstance
	 *            grupo a persistir
	 */
	public void persist(Grupo transientInstance);

	/**
	 * Salva o actualiza un Grupo.
	 * 
	 * @param instance
	 */
	public void attachDirty(Grupo instance);

	/**
	 * 
	 * @param instance
	 */
	public void attachClean(Grupo instance);

	/**
	 * Elimina un objeto Grupo
	 * 
	 * @param persistentInstance
	 */
	public void delete(Grupo persistentInstance);

	/**
	 * 
	 * @param detachedInstance
	 * @return
	 */
	public Grupo merge(Grupo detachedInstance);

	/**
	 * Obtiene un Grupo dado su id
	 * 
	 * @param id
	 *            id del objeto a buscar
	 * @return
	 */
	public Grupo findById(Integer id);

	/**
	 * Busca los objetos que cumplen con los criterios de <b>instance</b>
	 * 
	 * @param instance
	 *            modelo por el cual se buscarán objetos
	 * @return
	 */
	public List findByExample(Grupo instance);
}
