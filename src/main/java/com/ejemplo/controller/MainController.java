package com.ejemplo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ejemplo.service.EjemploService;

@Controller
@RequestMapping("/")
public class MainController {

	@Autowired
	EjemploService ejemploService;

	@RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
	public String index(ModelMap model) {

		return "index";
	}

	@RequestMapping(value = { "/ejemplos" }, method = RequestMethod.GET)
	public String ejemplos(ModelMap model) {

		model.addAttribute("ejemplos", ejemploService.findAllEjemplos());

		return "ejemplos";
	}

}
