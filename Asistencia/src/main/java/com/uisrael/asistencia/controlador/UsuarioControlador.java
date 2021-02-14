package com.uisrael.asistencia.controlador;

import java.util.List;

import com.uisrael.asistencia.modelo.entidades.Usuario;

public interface UsuarioControlador {
	public void insertarUsuario (Usuario nuevoUsuario);
	public void actualizarUsuario (Usuario actualizaUsuario);
	public void eliminarUsuario (int idUsuario);
	public List <Usuario> listarUsuario ();
	public Usuario buscarUsuario (String parametro, Usuario usuarioValor);

}
