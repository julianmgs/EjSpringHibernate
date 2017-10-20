package com.ejemplo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.ejemplo.model.Ejemplo;

@Repository("ejemploDao")
public class EjemploDaoImpl extends AbstractDao<Long, Ejemplo> implements
		EjemploDao {

	@Override
	public Ejemplo findById(Long id) {
		return super.findObjectById(id);
	}

	@Override
	public List<Ejemplo> findAll() {
		return super.findAllObjects();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ejemplo> findByTexto(String texto) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("texto", texto));
		return criteria.list();
	}

}
