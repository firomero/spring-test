package curso.ejemplos.dao.impl;

import static org.hibernate.criterion.Example.create;

import java.util.List;

import org.hibernate.LockMode;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import curso.ejemplos.bean.Grupo;
import curso.ejemplos.dao.GrupoDao;

public class GrupoDaoImpl extends HibernateDaoSupport implements GrupoDao {

	public void persist(Grupo transientInstance) {
		getHibernateTemplate().persist(transientInstance);
	}

	public void attachDirty(Grupo instance) {
		getHibernateTemplate().saveOrUpdate(instance);
	}

	public void attachClean(Grupo instance) {
		getHibernateTemplate().lock(instance, LockMode.NONE);
	}

	public void delete(Grupo persistentInstance) {
		getHibernateTemplate().delete(persistentInstance);
	}

	public Grupo merge(Grupo detachedInstance) {
		return (Grupo) getHibernateTemplate().merge(detachedInstance);
	}

	public Grupo findById(Integer id) {
		return (Grupo) getHibernateTemplate().get(Grupo.class, id);
	}

	public List findByExample(Grupo instance) {
		return getHibernateTemplate().getSessionFactory().getCurrentSession()
				.createCriteria(Grupo.class).add(create(instance)).list();
	}

	public List loadAll() {
		return getHibernateTemplate().loadAll(Grupo.class);
	}
}