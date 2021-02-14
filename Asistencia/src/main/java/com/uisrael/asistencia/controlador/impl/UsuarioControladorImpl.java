package com.uisrael.asistencia.controlador.impl;

import java.util.List;

import com.uisrael.asistencia.controlador.UsuarioControlador;
import com.uisrael.asistencia.modelo.dao.UsuarioDao;
import com.uisrael.asistencia.modelo.dao.impl.UsuarioDaoImpl;
import com.uisrael.asistencia.modelo.entidades.Usuario;

public class UsuarioControladorImpl implements UsuarioControlador{
	private UsuarioDao usuarioDao;
	
	@Override
	public void insertarUsuario(Usuario nuevoUsuario) {
		usuarioDao= new UsuarioDaoImpl();
		usuarioDao.insertarUsuario(nuevoUsuario);
	}

	@Override
	public List<Usuario> listarUsuario() {
		usuarioDao= new UsuarioDaoImpl();
		return usuarioDao.listarUsuario();
	}

	@Override
	public Usuario buscarUsuario(String parametro, Usuario usuarioValor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarUsuario(Usuario actualizaUsuario) {
		// TODO Auto-generated method stub
		usuarioDao= new UsuarioDaoImpl();
		usuarioDao.actualizarUsuario(actualizaUsuario);
	}

	@Override
	public void eliminarUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	
}
