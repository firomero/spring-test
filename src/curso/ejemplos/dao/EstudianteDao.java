package curso.ejemplos.dao;

import java.util.List;

import curso.ejemplos.bean.Estudiante;

public interface EstudianteDao {
	
	/**
	 * Craga todos los objetos de la clase Estudiante
	 */
	public List loadAll();
	
	/**
	 * Hace persistente un objeto Estudiante
	 * @param transientInstance estudiante a persistir
	 */
	public void persist(Estudiante transientInstance);
	
	/**
	 * Salva o actualiza un estudiante.
	 * @param instance
	 */
	public void attachDirty(Estudiante instance);
	
	/**
	 * 
	 * @param instance
	 */
	public void attachClean(Estudiante instance);
	
	/**
	 * Elimina un objeto Estudiante
	 * @param persistentInstance
	 */
	public void delete(Estudiante persistentInstance);
	
	public Estudiante merge(Estudiante detachedInstance);
	
	/**
	 * Obtiene un estudiante dado su id
	 * @param id id del objeto a buscar
	 * @return
	 */
	public Estudiante findById(Integer id);
	
	/**
	 * Busca los objetos que cumplen con los criterios de <b>instance</b>
	 * 
	 * @param instance
	 *            modelo por el cual se buscarán objetos
	 * @return
	 */
	public List findByExample(Estudiante instance);
}
