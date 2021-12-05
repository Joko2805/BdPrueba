package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alumno;
import com.example.demo.service.AlumnoService;

@RestController
@RequestMapping("/alumno")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class AlumnoController {

	@Autowired
	private AlumnoService service;
	
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		List<Alumno> lista = service.listar();
		return new ResponseEntity<>(lista,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> registrar(@RequestBody Alumno alumno){
		int cod = service.registrar(alumno);
		return new ResponseEntity<>(cod,HttpStatus.CREATED);
	}
}
