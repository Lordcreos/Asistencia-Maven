package com.uisrael.asistencia.vista;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.uisrael.asistencia.controlador.CursoControlador;
import com.uisrael.asistencia.modelo.entidades.Curso;
import com.uisrael.asistencia.controlador.impl.CursoControladorImpl;


@ManagedBean
@ViewScoped
public class CursoView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Curso nuevoCurso;
	private int idCurso;
	private String jornadaCurso;
	private String paraleloCurso;
	private int estadoCurso;
	private CursoControlador cursoControlador;
	private List<Curso> listaCurso;

	public CursoView() {
		
	}
	
	@PostConstruct
	public void init() {
		cursoControlador = new CursoControladorImpl();
		ListarCurso();
	}
	
	public void insertarCurso() {
		try {
			 nuevoCurso=new Curso();
			 nuevoCurso.setJornadaCurso(jornadaCurso);
			 nuevoCurso.setParaleloCurso(paraleloCurso);
			 nuevoCurso.setEstadoCurso(estadoCurso);
						 
			 System.out.println("Insertado");
			 cursoControlador.insertarCurso(nuevoCurso);
			 ListarCurso();
			 FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_INFO, "Info","Curso registrado Correctamente"));
				
			} catch (Exception e) {
				System.out.println("ERROR"+ e.getMessage());
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Info", "Error al ingresar Curso"));
			}
	}
	
	
	public void ListarCurso() {
		 listaCurso = cursoControlador.listarCurso();
	 }
	
	
	public void onRowEdit(RowEditEvent<Curso> event) {
		Curso cursoActualizar= new Curso();
		cursoActualizar= event.getObject();
		cursoControlador.actualizarCurso(cursoActualizar);
        FacesMessage msg = new FacesMessage("Curso Edited");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent<Curso> event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
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




	public CursoControlador getCursoControlador() {
		return cursoControlador;
	}




	//public void setCursoControlador(CursoControlador cursoControlador) {
	//	cursoControlador = cursoControlador;
	//}




	public List<Curso> getListaCurso() {
		return listaCurso;
	}




	public void setListaCurso(List<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}

	
}
