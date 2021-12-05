package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Alumno;
import com.example.demo.repository.IAlumnoRepository;

@Service
@Transactional
public class AlumnoService {

	@Autowired
	private IAlumnoRepository repository;
	
	public Integer registrar(Alumno alumno) {
		repository.save(alumno);
		return alumno.getAlumnoId();
	}
	
	public List<Alumno> listar(){
		return (List<Alumno>) repository.findAll();
	}
}
