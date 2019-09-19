package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CPuerto;

public interface IPuertoService {

	
	public void insertar(CPuerto motor);

	public List<CPuerto> listar();

	public void eliminar(int c_Puerto);
}
