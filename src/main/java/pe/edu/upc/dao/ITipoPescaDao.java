package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.CTipoPesca;



public interface ITipoPescaDao {
	public void insertar(CTipoPesca pesca);

	public List<CTipoPesca> listar();
	
	public void eliminar(int c_Pesca);
}
