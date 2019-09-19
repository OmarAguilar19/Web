package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CProveedor;



public interface IProveedorDao {

	public void insertar(CProveedor motor);

	public List<CProveedor> listar();
	
	public void eliminar(int c_Proveedor);
}
