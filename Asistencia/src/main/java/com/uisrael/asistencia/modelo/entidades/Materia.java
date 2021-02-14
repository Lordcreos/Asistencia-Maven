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
@Table (name = "asis_materia")
public class Materia implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int idMateria;
	private String nombreMateria;
	private int estadoMateria;
	
	@OneToMany(mappedBy="fkMateria",fetch=FetchType.LAZY)
	
	private List <Asistencia> listaAsistencia= new ArrayList();
	
	public Materia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdMateria() {
		return idMateria;
	}

	public void setIdMateria(int idMateria) {
		this.idMateria = idMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public int getEstadoMateria() {
		return estadoMateria;
	}

	public void setEstadoMateria(int estadoMateria) {
		this.estadoMateria = estadoMateria;
	}

	@Override
	public String toString() {
		return "Materia [idMateria=" + idMateria + ", nombreMateria=" + nombreMateria + ", estadoMateria="
				+ estadoMateria + "]";
	}
	

}
