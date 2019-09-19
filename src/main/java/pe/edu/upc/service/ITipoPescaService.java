package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.CTipoPesca;



public interface ITipoPescaService {
	
	public void insertar(CTipoPesca motor);

	public List<CTipoPesca> listar();

	public void eliminar(int c_TipoPesca);
}

