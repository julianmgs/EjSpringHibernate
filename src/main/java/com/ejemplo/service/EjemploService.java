package com.ejemplo.service;

import java.util.List;

import com.ejemplo.model.Ejemplo;

public interface EjemploService {

	public Ejemplo findEjemploById(Long id);

	public List<Ejemplo> findAllEjemplos();

	public List<Ejemplo> findAllByTexto(String texto);

}
