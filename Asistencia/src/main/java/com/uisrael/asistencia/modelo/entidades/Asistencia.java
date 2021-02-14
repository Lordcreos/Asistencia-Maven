package com.uisrael.asistencia.modelo.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "asis_asistencia")

public class Asistencia implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idAsistencia;
	private Date fechaAsistencia;
	private int estadoAsistencia;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn (name= "idCurso")
	private Curso fkCurso;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn (name="idMateria")
	private Materia fkMateria;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn (name="idUsuario")
	private Usuario fkUsuario;
	
	
	public Asistencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdAsistencia() {
		return idAsistencia;
	}

	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public Date getFechaAsistencia() {
		return fechaAsistencia;
	}

	public void setFechaAsistencia(Date fechaAsistencia) {
		this.fechaAsistencia = fechaAsistencia;
	}

	public int getEstadoAsistencia() {
		return estadoAsistencia;
	}

	public void setEstadoAsistencia(int estadoAsistencia) {
		this.estadoAsistencia = estadoAsistencia;
	}

	@Override
	public String toString() {
		return "Asistencia [idAsistencia=" + idAsistencia + ", fechaAsistencia=" + fechaAsistencia
				+ ", estadoAsistencia=" + estadoAsistencia + "]";
	}
		
	

}
