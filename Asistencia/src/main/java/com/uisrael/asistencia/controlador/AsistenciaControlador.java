package com.uisrael.asistencia.controlador;

import java.util.List;

import com.uisrael.asistencia.modelo.entidades.Asistencia;

public interface AsistenciaControlador {
	public void insertarAsistencia (Asistencia nuevoAsistencia);
	public void actualizarAsistencia (Asistencia actualizaAsistencia);
	public void eliminarAsistencia (int idAsistencia);
	public List <Asistencia> listarAsistencia ();
	public List <Asistencia> listarCurso ();
	public List <Asistencia> listarMateria ();
	public List <Asistencia> listarUsuario();
	public Asistencia buscarAsistencia (String parametro, Asistencia asistenciaValor);

}
