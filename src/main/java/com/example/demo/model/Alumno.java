package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "alumno_id")
	private Integer alumnoId;
	
	@Column
	private String nombre;
	
	@Column
	private String apellidoPaterno;
	
	@Column
	private String apellidoMaterno;
	
	@Lob
	@Column(name = "foto_alumno", columnDefinition = "LONGBLOB")
	private byte[] fotoAlumno;

	public Integer getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(Integer alumnoId) {
		this.alumnoId = alumnoId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public byte[] getFotoAlumno() {
		return fotoAlumno;
	}

	public void setFotoAlumno(byte[] fotoAlumno) {
		this.fotoAlumno = fotoAlumno;
	}
}


