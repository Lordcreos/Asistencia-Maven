package com.uisrael.asistencia.modelo.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


import com.uisrael.asistencia.modelo.dao.UsuarioDao;
import com.uisrael.asistencia.modelo.entidades.Usuario;


public class UsuarioDaoImpl extends GenericaDaoImpl<Usuario> implements UsuarioDao{

	@Override
	public void insertarUsuario(Usuario nuevoUsuario) {
		// TODO Auto-generated method stub
		try {
		     this.beginTransaction();
		     this.create(nuevoUsuario);
		     this.commit();
		
	     } catch (Exception e) {
		   this.rollback();
	     }
	}

	@Override
	public void actualizarUsuario(Usuario actualizaUsuario) {
		// TODO Auto-generated method stub
		try {
		     this.beginTransaction();
		     this.update(actualizaUsuario);
		     this.commit();
		
	     } catch (Exception e) {
		   this.rollback();
	     }
	}

	@Override
	public void eliminarUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listarUsuario() {
		// Select * from Usuario
				CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
				CriteriaQuery<Usuario> c = cb.createQuery(Usuario.class);
				Root<Usuario> Usuario = c.from(Usuario.class);
				c.select(Usuario);
				return this.entityManager.createQuery(c).getResultList();
		
	}

	@Override
	public Usuario buscarUsuario(String parametro, Usuario usuarioValor ){
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Usuario> c = cb.createQuery(Usuario.class);
		Root<Usuario> usuario = c.from(Usuario.class);
		if (parametro=="nombre"){
			c.select(usuario).where(cb.equal(usuario.get("apellido"), usuarioValor.getApellidoUsuario()));
					
		}
		if (parametro=="id"){
			c.select(usuario).where(cb.equal(usuario.get("idUsuario"), usuarioValor.getIdUsuario()));
					
		}
				
		return this.entityManager.createQuery(c).getSingleResult();
		
	}



}
