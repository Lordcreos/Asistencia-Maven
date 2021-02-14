package com.uisrael.asistencia.vista;

import java.io.Serializable;
import java.util.List;

import javax.annotation.*;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.uisrael.asistencia.modelo.entidades.Materia;
import com.uisrael.asistencia.controlador.MateriaControlador;
import com.uisrael.asistencia.controlador.impl.MateriaControladorImpl;
@ManagedBean
@ViewScoped

public class MateriaView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Materia nuevoMateria;
	private int idMateria;
	private String nombreMateria;
	private int estadoMateria;
	private MateriaControlador materiaControlador;
	private List<Materia> listaMateria;

	public MateriaView() {
		
	}
	
	@PostConstruct
	public void init() {
		materiaControlador = new MateriaControladorImpl();
		ListarMateria();
	}
	
	public void insertarMateria() {
		try {
			 nuevoMateria=new Materia();
			 nuevoMateria.setNombreMateria(nombreMateria);
			 nuevoMateria.setEstadoMateria(estadoMateria);
						 
			 System.out.println("Insertado");
			 materiaControlador.insertarMateria(nuevoMateria);
			 ListarMateria();
			 FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_INFO, "Info","Materia registrado Correctamente"));
				
			} catch (Exception e) {
				System.out.println("ERROR"+ e.getMessage());
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Info", "Error al ingresar Materia"));
			}
	}
	public void ListarMateria() {
		 listaMateria = materiaControlador.listarMateria();
	 }

	public void onRowEdit(RowEditEvent<Materia> event) {
		Materia materiaActualizar= new Materia();
		materiaActualizar= event.getObject();
		materiaControlador.actualizarMateria(materiaActualizar);
        FacesMessage msg = new FacesMessage("Curso Edited");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent<Materia> event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
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

	public MateriaControlador getMateriaControlador() {
		return materiaControlador;
	}

	//public void setMateriaControlador(MateriaControlador materiaControlador) {
	//	materiaControlador = materiaControlador;
	//}

	public List<Materia> getListaMateria() {
		return listaMateria;
	}

	public void setListaMateria(List<Materia> listaMateria) {
		this.listaMateria = listaMateria;
	}
	
}
