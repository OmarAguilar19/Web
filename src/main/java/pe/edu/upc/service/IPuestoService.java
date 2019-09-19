package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CPuesto;

public interface IPuestoService {
	public void insertar(CPuesto C_CPuesto);

	public List<CPuesto> listar();

	public void eliminar(int C_CPuesto);
}
