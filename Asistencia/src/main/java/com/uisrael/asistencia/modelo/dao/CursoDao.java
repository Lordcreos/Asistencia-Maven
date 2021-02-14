package com.uisrael.asistencia.modelo.dao;

import java.util.List;

import com.uisrael.asistencia.modelo.entidades.Curso;

public interface CursoDao {
	
	public void insertarCurso (Curso nuevoCurso);
	public void actualizarCurso (Curso actualizaCurso);
	public void eliminarCurso (int idCurso);
	public List <Curso> listarCurso ();
	public Curso buscarCurso (String parametro, Curso cursoValor);
	

}
