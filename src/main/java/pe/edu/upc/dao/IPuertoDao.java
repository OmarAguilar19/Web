package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CPuerto;


public interface IPuertoDao {

	public void insertar(CPuerto motor);

	public List<CPuerto> listar();
	
	public void eliminar(int c_Puerto);
}
