package com.uisrael.asistencia.modelo.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.uisrael.asistencia.modelo.dao.CursoDao;
import com.uisrael.asistencia.modelo.entidades.Curso;


public class CursoDaoImpl extends GenericaDaoImpl<Curso> implements CursoDao{

	@Override
	public void insertarCurso(Curso nuevoCurso) {
		// TODO Auto-generated method stub
		try {
		     this.beginTransaction();
		     this.create(nuevoCurso);
		     this.commit();
		
	     } catch (Exception e) {
		   this.rollback();
	     }
	}

	@Override
	public void actualizarCurso(Curso actualizaCurso) {
		// TODO Auto-generated method stub
		try {
		     this.beginTransaction();
		     this.update(actualizaCurso);
		     this.commit();
		
	     } catch (Exception e) {
		   this.rollback();
	     }
	}

	@Override
	public void eliminarCurso(int idCurso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Curso> listarCurso() {
		// Select * from Curso
				CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
				CriteriaQuery<Curso> c = cb.createQuery(Curso.class);
				Root<Curso> Curso = c.from(Curso.class);
				c.select(Curso);
				return this.entityManager.createQuery(c).getResultList();
	}

	@Override
	public Curso buscarCurso(String parametro, Curso cursoValor) {
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Curso> c = cb.createQuery(Curso.class);
		Root<Curso> curso = c.from(Curso.class);
		if (parametro=="nombre"){
			c.select(curso).where(cb.equal(curso.get("idCurso"), cursoValor.getParaleloCurso()));
					
		}
		if (parametro=="id"){
			c.select(curso).where(cb.equal(curso.get("idCurso"), cursoValor.getIdCurso()));
					
		}
		
		return this.entityManager.createQuery(c).getSingleResult();
	}

	
	

}
