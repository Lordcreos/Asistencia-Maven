package com.uisrael.asistencia.modelo.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "asis_curso")

public class Curso implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCurso;
	private String jornadaCurso;
	private String paraleloCurso;
	private int estadoCurso;
	
	@OneToMany(mappedBy="fkCurso",fetch=FetchType.LAZY)
	
	private List <Asistencia> listaAsistencia= new ArrayList();
	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getJornadaCurso() {
		return jornadaCurso;
	}

	public void setJornadaCurso(String jornadaCurso) {
		this.jornadaCurso = jornadaCurso;
	}

	public String getParaleloCurso() {
		return paraleloCurso;
	}

	public void setParaleloCurso(String paraleloCurso) {
		this.paraleloCurso = paraleloCurso;
	}

	public int getEstadoCurso() {
		return estadoCurso;
	}

	public void setEstadoCurso(int estadoCurso) {
		this.estadoCurso = estadoCurso;
	}
	

	public List<Asistencia> getListaAsistencia() {
		return listaAsistencia;
	}

	public void setListaAsistencia(List<Asistencia> listaAsistencia) {
		this.listaAsistencia = listaAsistencia;
	}

	@Override
	public String toString() {
		return "Curso [idCurso=" + idCurso + ", jornadaCurso=" + jornadaCurso + ", paraleloCurso=" + paraleloCurso
				+ ", estadoCurso=" + estadoCurso + ", listaAsistencia=" + listaAsistencia + "]";
	}

	
	
	

}
