package com.uisrael.asistencia.controlador.impl;

import java.util.List;

import com.uisrael.asistencia.controlador.CursoControlador;
import com.uisrael.asistencia.modelo.dao.CursoDao;
import com.uisrael.asistencia.modelo.dao.impl.CursoDaoImpl;
import com.uisrael.asistencia.modelo.entidades.Curso;

public class CursoControladorImpl implements CursoControlador{
private CursoDao cursoDao;
	
	@Override
	public void insertarCurso(Curso nuevoCurso) {
		cursoDao= new CursoDaoImpl();
		cursoDao.insertarCurso(nuevoCurso);
	}

	@Override
	public List<Curso> listarCurso() {
		cursoDao= new CursoDaoImpl();
		return cursoDao.listarCurso();
	}

	@Override
	public Curso buscarCurso(String parametro, Curso cursoValor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCurso(Curso actualizaCurso) {
		// TODO Auto-generated method stub
		cursoDao= new CursoDaoImpl();
		cursoDao.actualizarCurso(actualizaCurso);
	}

	@Override
	public void eliminarCurso(int idCurso) {
		// TODO Auto-generated method stub
		
	}
	
}
