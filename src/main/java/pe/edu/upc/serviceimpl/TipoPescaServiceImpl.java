package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoPescaDao;
import pe.edu.upc.entity.CTipoPesca;
import pe.edu.upc.service.ITipoPescaService;

@Named
@RequestScoped
public class TipoPescaServiceImpl implements ITipoPescaService,Serializable {
	private static final long serialVersionUID = 1L;
	@Inject
	private ITipoPescaDao tpD;

	@Override
	public void insertar(CTipoPesca tipopesca) {
		tpD.insertar(tipopesca);
	}

	@Override
	public List<CTipoPesca> listar() {
		// TODO Auto-generated method stub
		return tpD.listar();
	}

	@Override
	public void eliminar(int c_TipoPesca) {
		tpD.eliminar(c_TipoPesca);
	}
}
