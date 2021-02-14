package com.uisrael.asistencia.controlador.impl;

import java.util.List;

import com.uisrael.asistencia.controlador.MateriaControlador;
import com.uisrael.asistencia.modelo.dao.MateriaDao;
import com.uisrael.asistencia.modelo.dao.impl.MateriaDaoImpl;
import com.uisrael.asistencia.modelo.entidades.Materia;

public class MateriaControladorImpl implements MateriaControlador{
private MateriaDao materiaDao;
	
	@Override
	public void insertarMateria(Materia nuevoMateria) {
		materiaDao= new MateriaDaoImpl();
		materiaDao.insertarMateria(nuevoMateria);
	}

	@Override
	public List<Materia> listarMateria() {
		materiaDao= new MateriaDaoImpl();
		return materiaDao.listarMateria();
	}

	@Override
	public Materia buscarMateria(String parametro, Materia materiaValor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarMateria(Materia actualizaMateria) {
		// TODO Auto-generated method stub
		materiaDao= new MateriaDaoImpl();
		materiaDao.actualizarMateria (actualizaMateria);
	}

	@Override
	public void eliminarCurso(int idCurso) {
		// TODO Auto-generated method stub
		
	}

}
