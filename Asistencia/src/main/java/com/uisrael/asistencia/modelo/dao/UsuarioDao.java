package com.uisrael.asistencia.modelo.dao;

import java.util.List;

import com.uisrael.asistencia.modelo.entidades.Usuario;

public interface UsuarioDao {
	
	public void insertarUsuario (Usuario nuevoUsuario);
	public void actualizarUsuario (Usuario actualizaUsuario);
	public void eliminarUsuario (int idUsuario);
	public List <Usuario> listarUsuario ();
	public Usuario buscarUsuario (String parametro, Usuario usuarioValor);

}
