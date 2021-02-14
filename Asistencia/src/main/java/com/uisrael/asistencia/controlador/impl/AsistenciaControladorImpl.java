package com.uisrael.asistencia.controlador.impl;

import java.util.List;

import com.uisrael.asistencia.controlador.AsistenciaControlador;
import com.uisrael.asistencia.modelo.dao.AsistenciaDao;
import com.uisrael.asistencia.modelo.dao.impl.AsistenciaDaoImpl;
import com.uisrael.asistencia.modelo.entidades.Asistencia;

public class AsistenciaControladorImpl implements AsistenciaControlador{
private AsistenciaDao asistenciaDao;
	
	@Override
	public void insertarAsistencia(Asistencia nuevoAsistencia) {
		asistenciaDao= new AsistenciaDaoImpl();
		asistenciaDao.insertarAsistencia(nuevoAsistencia);
	}

	@Override
	public List<Asistencia> listarAsistencia() {
		asistenciaDao= new AsistenciaDaoImpl();
		return asistenciaDao.listarAsistencia();
	}

	@Override
	public Asistencia buscarAsistencia(String parametro, Asistencia asistenciaValor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarAsistencia(Asistencia actualizaAsistencia) {
		// TODO Auto-generated method stub
		asistenciaDao= new AsistenciaDaoImpl();
		asistenciaDao.actualizarAsistencia(actualizaAsistencia);
	}

	@Override
	public void eliminarAsistencia(int idAsistencia) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Asistencia> listarCurso() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Asistencia> listarMateria() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Asistencia> listarUsuario() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
