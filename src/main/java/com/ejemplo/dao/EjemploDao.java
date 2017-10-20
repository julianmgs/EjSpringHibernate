package com.ejemplo.dao;

import java.util.List;

import com.ejemplo.model.Ejemplo;

public interface EjemploDao {

	public Ejemplo findById(Long id);

	public List<Ejemplo> findAll();

	public List<Ejemplo> findByTexto(String texto);

}
