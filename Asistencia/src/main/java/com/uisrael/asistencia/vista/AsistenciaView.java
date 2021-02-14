package com.uisrael.asistencia.vista;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.uisrael.asistencia.controlador.AsistenciaControlador;
import com.uisrael.asistencia.controlador.CursoControlador;
import com.uisrael.asistencia.controlador.MateriaControlador;
import com.uisrael.asistencia.controlador.UsuarioControlador;
import com.uisrael.asistencia.controlador.impl.AsistenciaControladorImpl;
import com.uisrael.asistencia.controlador.impl.CursoControladorImpl;
import com.uisrael.asistencia.controlador.impl.MateriaControladorImpl;
import com.uisrael.asistencia.controlador.impl.UsuarioControladorImpl;
import com.uisrael.asistencia.modelo.entidades.Asistencia;
import com.uisrael.asistencia.modelo.entidades.Usuario;
import com.uisrael.asistencia.modelo.entidades.Materia;
import com.uisrael.asistencia.modelo.entidades.Curso;


public class AsistenciaView implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Curso nuevoCurso;
	private Materia nuevoMateria;
	private Usuario nuevoUsuario;
	private Asistencia nuevoAsistencia;
	private Date fechaAsistencia;
	private int estadoAsistencia;
	private List<Asistencia> listarAsistencia;
	private List<Usuario> listarUsuario;
	private List<Materia> listarMateria;
	private List<Curso> listarCurso;
	private int idAsistencia;
	private AsistenciaControlador asistenciaControlador;
	private UsuarioControlador usuarioControlador;
	private MateriaControlador materiaControlador;
	private CursoControlador cursoControlador;
	
	
	public AsistenciaView() {
	}
	
	public void init() {
		asistenciaControlador = new AsistenciaControladorImpl();
		usuarioControlador = new UsuarioControladorImpl();
		materiaControlador = new MateriaControladorImpl();
		cursoControlador = new CursoControladorImpl();
		listarAsistencia();
		listarUsuario();
		listarMateria();
		listarCurso();
		
	}
	
	public void insertarAsistencia() {
		try {
		nuevoAsistencia = new Asistencia();
		nuevoAsistencia.setFechaAsistencia(fechaAsistencia);
		nuevoAsistencia.setEstadoAsistencia(estadoAsistencia);
		nuevoAsistencia.setIdAsistencia(idAsistencia);
		asistenciaControlador.insertarAsistencia(nuevoAsistencia);
		cursoControlador.insertarCurso(nuevoCurso);
		materiaControlador.insertarMateria(nuevoMateria);
		usuarioControlador.insertarUsuario(nuevoUsuario);
		listarAsistencia();
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
				(FacesMessage.SEVERITY_INFO,"Info","Asistencia Ingresada Correctamente"));
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Insertado"+ e.getMessage());
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage
					(FacesMessage.SEVERITY_ERROR, "Info","Error al Insertar Asistencia"));
		}

	}
	
	
	private void listarAsistencia() {
		// TODO Auto-generated method stub
		listarAsistencia = asistenciaControlador.listarAsistencia();
		
	}

	private void listarUsuario() {
		// TODO Auto-generated method stub
		listarAsistencia = asistenciaControlador.listarUsuario();
		
	}
	
	private void listarMateria() {
		// TODO Auto-generated method stub
		listarAsistencia = asistenciaControlador.listarMateria();
		
	}
	
	private void listarCurso() {
		// TODO Auto-generated method stub
		//listarAsistencia = asistenciaControlador.listarAsistencia();
		listarAsistencia= asistenciaControlador.listarCurso();
	}
		
	public void onRowEdit(RowEditEvent<Asistencia> event) {
		Asistencia asistenciaActualizar= new Asistencia();
		asistenciaActualizar= event.getObject();
		asistenciaControlador.actualizarAsistencia(asistenciaActualizar);
        FacesMessage msg = new FacesMessage("Asistencia Edited");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent<Asistencia> event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
    
    
	public Asistencia getNuevoAsistencia() {
		return nuevoAsistencia;
	}

	public void setNuevoAsistencia(Asistencia nuevoAsistencia) {
		this.nuevoAsistencia = nuevoAsistencia;
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

	public List<Asistencia> getListarAsistencia() {
		return listarAsistencia;
	}

	public void setListarAsistencia(List<Asistencia> listarAsistencia) {
		this.listarAsistencia = listarAsistencia;
	}

	public List<Usuario> getListarUsuario() {
		return listarUsuario;
	}

	public void setListarUsuario(List<Usuario> listarUsuario) {
		this.listarUsuario = listarUsuario;
	}

	public List<Materia> getListarMateria() {
		return listarMateria;
	}

	public void setListarMateria(List<Materia> listarMateria) {
		this.listarMateria = listarMateria;
	}

	public List<Curso> getListarCurso() {
		return listarCurso;
	}

	public void setListarCurso(List<Curso> listarCurso) {
		this.listarCurso = listarCurso;
	}

	public int getIdAsistencia() {
		return idAsistencia;
	}

	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}
	
	
	
}