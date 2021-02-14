package com.uisrael.asistencia.modelo.dao;

import java.util.List;

import com.uisrael.asistencia.modelo.entidades.Materia;

public interface MateriaDao {
	
	public void insertarMateria (Materia nuevoMateria);
	public void actualizarMateria (Materia actualizaMateria);
	public void eliminarCurso (int idCurso);
	public List <Materia> listarMateria ();
	public Materia buscarMateria (String parametro, Materia materiaValor);

}
