package com.uisrael.asistencia.controlador;

import java.util.List;

import com.uisrael.asistencia.modelo.entidades.Curso;

public interface CursoControlador {
	

	public void insertarCurso (Curso nuevoCurso);
	public void actualizarCurso (Curso actualizaCurso);
	public void eliminarCurso (int idCurso);
	public List <Curso> listarCurso ();
	public Curso buscarCurso (String parametro, Curso cursoValor);
	

}
