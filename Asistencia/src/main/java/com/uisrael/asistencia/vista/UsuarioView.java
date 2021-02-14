package com.uisrael.asistencia.vista;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.RowEditEvent;

import com.uisrael.asistencia.controlador.UsuarioControlador;
import com.uisrael.asistencia.controlador.impl.UsuarioControladorImpl;
import com.uisrael.asistencia.modelo.entidades.Usuario;
@ManagedBean
@ViewScoped

public class UsuarioView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario nuevoUsuario;
	private int idUsuario;
	private String cedulaUsuario;
	private String apellidoUsuario;
	private String nombreUsuario;
	private String tipoUsuario;
	private String passwordUsuario;
	private int estadoUsuario;
	private UsuarioControlador usuarioControlador;
	private List<Usuario> listaUsuario;

	public UsuarioView() {
		
	}
	@PostConstruct
	public void init() {
		usuarioControlador = new UsuarioControladorImpl();
		ListarUsuario();
	}
	
	public void insertarUsuario() {
		try {
			 nuevoUsuario=new Usuario();
			 nuevoUsuario.setCedulaUsuario(cedulaUsuario);
			 nuevoUsuario.setApellidoUsuario(apellidoUsuario);
			 nuevoUsuario.setNombreUsuario(nombreUsuario);
			 nuevoUsuario.setTipoUsuario(tipoUsuario);
			 nuevoUsuario.setPasswordUsuario(passwordUsuario);
			 nuevoUsuario.setEstadoUsuario(estadoUsuario);
						 
			 System.out.println("Insertado");
			 usuarioControlador.insertarUsuario(nuevoUsuario);
			 ListarUsuario();
			 FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_INFO, "Info","Usuario registrado Correctamente"));
				
			} catch (Exception e) {
				System.out.println("ERROR"+ e.getMessage());
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_ERROR, "Info", "Error al ingresar Usuario"));
			}
	}
	
	public void ListarUsuario() {
		 listaUsuario = usuarioControlador.listarUsuario();
	 }

	public void onRowEdit(RowEditEvent<Usuario> event) {
		Usuario usuarioActualizar= new Usuario();
		usuarioActualizar= event.getObject();
		usuarioControlador.actualizarUsuario(usuarioActualizar);
        FacesMessage msg = new FacesMessage("Usuario Edited");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
     
    public void onRowCancel(RowEditEvent<Usuario> event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
	
	public Usuario getNewUsuario() {
		return nuevoUsuario;
	}

	public void setNewUsuario(Usuario nuevoUsuario) {
		this.nuevoUsuario = nuevoUsuario;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCedulaUsuario() {
		return cedulaUsuario;
	}

	public void setCedulaUsuario(String cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}

	public int getEstadoUsuario() {
		return estadoUsuario;
	}

	public void setEstadoUsuario(int estadoUsuario) {
		this.estadoUsuario = estadoUsuario;
	}

	public List<Usuario> getListaUsuario() {
		return listaUsuario;
	}

	public void setListaUsuario(List<Usuario> listaUsuario) {
		this.listaUsuario = listaUsuario;
	}

	
}
