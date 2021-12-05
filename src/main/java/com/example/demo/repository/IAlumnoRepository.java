package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Alumno;

@Repository
public interface IAlumnoRepository extends CrudRepository<Alumno, Integer> {

}
