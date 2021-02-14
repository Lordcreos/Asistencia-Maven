package com.uisrael.asistencia.modelo.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.uisrael.asistencia.modelo.dao.AsistenciaDao;
import com.uisrael.asistencia.modelo.entidades.Asistencia;



public class AsistenciaDaoImpl extends GenericaDaoImpl<Asistencia> implements AsistenciaDao{

	@Override
	public void insertarAsistencia(Asistencia nuevoAsistencia) {
		// TODO Auto-generated method stub
		try {
		     this.beginTransaction();
		     this.create(nuevoAsistencia);
		     this.commit();
		
	     } catch (Exception e) {
		   this.rollback();
	     }
	}

	@Override
	public void actualizarAsistencia(Asistencia actualizaAsistencia) {
		// TODO Auto-generated method stub
		try {
		     this.beginTransaction();
		     this.update(actualizaAsistencia);
		     this.commit();
		
	     } catch (Exception e) {
		   this.rollback();
	     }
	}

	@Override
	public void eliminarAsistencia(int idAsistencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Asistencia> listarAsistencia() {
		// Select * from Asistencia
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Asistencia> c = cb.createQuery(Asistencia.class);
		Root<Asistencia> Asistencia = c.from(Asistencia.class);
		c.select(Asistencia);
		return this.entityManager.createQuery(c).getResultList();
	}

	@Override
	public Asistencia buscarAsistencia(String parametro, Asistencia asistenciaValor) {
		CriteriaBuilder cb = this.entityManager.getCriteriaBuilder();
		CriteriaQuery<Asistencia> c = cb.createQuery(Asistencia.class);
		Root<Asistencia> asistencia = c.from(Asistencia.class);
		if (parametro=="fechaAsistencia"){
			c.select(asistencia).where(cb.equal(asistencia.get("fechaAsistencia"), asistenciaValor.getFechaAsistencia()));
					
		}
		if (parametro=="id"){
			c.select(asistencia).where(cb.equal(asistencia.get("idAsistencia"), asistenciaValor.getIdAsistencia()));
					
		}
		
		
		return this.entityManager.createQuery(c).getSingleResult();
	}

	
}
