package com.uisrael.asistencia.modelo.dao;

import java.util.List;

import com.uisrael.asistencia.modelo.entidades.Asistencia;

public interface AsistenciaDao {
	
	public void insertarAsistencia (Asistencia nuevoAsistencia);
	public void actualizarAsistencia (Asistencia actualizaAsistencia);
	public void eliminarAsistencia (int idAsistencia);
	public List <Asistencia> listarAsistencia ();
	public Asistencia buscarAsistencia (String parametro, Asistencia asistenciaValor);

}
