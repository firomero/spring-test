package curso.ejemplos.dao.impl;

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import curso.ejemplos.bean.Estudiante;
import curso.ejemplos.dao.EstudianteDao;

public class EstudianteDaoImpl extends HibernateDaoSupport implements
		EstudianteDao {

	public void persist(Estudiante transientInstance) {
		getHibernateTemplate().persist(transientInstance);
	}

	public void attachDirty(Estudiante instance) {
		getHibernateTemplate().saveOrUpdate(instance);
	}

	public void attachClean(Estudiante instance) {
		getHibernateTemplate().lock(instance, LockMode.NONE);
	}

	public void delete(Estudiante persistentInstance) {
		getHibernateTemplate().delete(persistentInstance);
	}

	public Estudiante merge(Estudiante detachedInstance) {
		return (Estudiante) getHibernateTemplate().merge(detachedInstance);
	}

	public Estudiante findById(Integer id) {
		return (Estudiante) getHibernateTemplate().get(Estudiante.class, id);
	}

	public List findByExample(Estudiante instance) {
		return getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createCriteria(Estudiante.class).add(create(instance)).list();
	}

	public List loadAll() {
		return getHibernateTemplate().loadAll(Estudiante.class);
	}

}