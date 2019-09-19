package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPuestoDao;
import pe.edu.upc.entity.CPuesto;
import pe.edu.upc.service.IPuestoService;


@Named
@RequestScoped
public class PuestoServiceImpl implements IPuestoService {
	@Inject
	private IPuestoDao pd;

	@Override
	public void insertar(CPuesto C_CPuesto) {
		pd.insertar(C_CPuesto);
		
	}

	@Override
	public List<CPuesto> listar() {
		
		return pd.listar();
	}

	@Override
	public void eliminar(int C_CPuesto) {
		pd.eliminar(C_CPuesto);
		
	}

}
