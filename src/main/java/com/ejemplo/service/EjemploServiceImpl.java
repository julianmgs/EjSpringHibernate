package com.ejemplo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ejemplo.dao.EjemploDao;
import com.ejemplo.model.Ejemplo;

@Service("jugadorService")
@Transactional
public class EjemploServiceImpl implements EjemploService {

	@Autowired
	EjemploDao ejemploDao;

	@Override
	public Ejemplo findEjemploById(Long id) {
		return ejemploDao.findById(id);
	}

	@Override
	public List<Ejemplo> findAllEjemplos() {
		return ejemploDao.findAll();
	}

	@Override
	public List<Ejemplo> findAllByTexto(String texto) {
		return ejemploDao.findByTexto(texto);
	}
}
