package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.CTipoPesca;
import pe.edu.upc.service.ITipoPescaService;

@Named
@RequestScoped
public class TipoPescaController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Inject
	private ITipoPescaService tpService;
	private CTipoPesca tpesca;
	List<CTipoPesca> listaTipoPesca;
	
	
	
	@PostConstruct
	public void init() {
		this.listaTipoPesca = new ArrayList<CTipoPesca>();
		this.tpesca = new CTipoPesca();
		this.listar();
	}
	
	// metodos
	public String nuevoTipoPesca() {
		this.setTpesca(new CTipoPesca());
		return "tipopesca.xhtml";
	}
	public void insertar() {
		try {

			tpService.insertar(tpesca);
			limpiarPuerto();

			this.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void listar() {
		try {
			listaTipoPesca = tpService.listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	public void limpiarPuerto() {
		this.init();
	}
	public void eliminar(CTipoPesca tipopesca) {
		try {
			tpService.eliminar(tipopesca.getC_TipoPesca());
			listar();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
	
	
	public CTipoPesca getTpesca() {
		return tpesca;
	}
	public void setTpesca(CTipoPesca tpesca) {
		this.tpesca = tpesca;
	}
	public List<CTipoPesca> getListaTipoPesca() {
		return listaTipoPesca;
	}
	public void setListaTipoPesca(List<CTipoPesca> listaTipoPesca) {
		this.listaTipoPesca = listaTipoPesca;
	}

}
