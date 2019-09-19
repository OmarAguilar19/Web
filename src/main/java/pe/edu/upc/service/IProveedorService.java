package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CProveedor;



public interface IProveedorService {
	
	public void insertar(CProveedor motor);

	public List<CProveedor> listar();

	public void eliminar(int c_Proveedor);
	public void modificar_update();
}

