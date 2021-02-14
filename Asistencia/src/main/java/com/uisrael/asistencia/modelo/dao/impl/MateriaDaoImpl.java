package com.uisrael.asistencia.modelo.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.uisrael.asistencia.modelo.dao.MateriaDao;
import com.uisrael.asistencia.modelo.entidades.Materia;


public class MateriaDaoImpl extends GenericaDaoImpl<Materia> implements MateriaDao{

	@Override
	public void insertarMateria(Materia nuevoMateria) {
		// TODO Auto-generated method stub
		try {
		     this.beginTransaction();
		     this.create(nuevoMateria);
		     this.commit();
		
	     } catch (Exception e) {
		   this.rollback();
	     }
		
	}

	@Override
	public void actualizarMateria(Materia actualizaMateria) {
		// TODO Auto-generated method stub
		try {
		     this.beginTransaction();
		     this.update(actualizaMateria);
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
	public List<Materia> listarMateria() {
		// Select * from Materia
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Materia> c = cb.createQuery(Materia.class);
		Root<Materia> Materia = c.from(Materia.class);
		c.select(Materia);
		return this.entityManager.createQuery(c).getResultList();
	}

	@Override
	public Materia buscarMateria(String parametro, Materia materiaValor) {
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Materia> c = cb.createQuery(Materia.class);
		Root<Materia> materia = c.from(Materia.class);
		if (parametro=="nombre"){
			c.select(materia).where(cb.equal(materia.get("nombreMateria"), materiaValor.getNombreMateria()));
					
		}
		if (parametro=="id"){
			c.select(materia).where(cb.equal(materia.get("idMateria"), materiaValor.getIdMateria()));
					
		}
		
		return this.entityManager.createQuery(c).getSingleResult();
		
	}

	

}
