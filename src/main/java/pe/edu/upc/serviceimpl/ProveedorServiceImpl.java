package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IProveedorDao;
import pe.edu.upc.entity.CProveedor;
import pe.edu.upc.service.IProveedorService;


@Named
@RequestScoped
public class ProveedorServiceImpl implements IProveedorService,Serializable {

	
	private static final long serialVersionUID = 1L;
	@Inject
	private IProveedorDao pD;

	@Override
	public void insertar(CProveedor provee) {
		pD.insertar(provee);
	}
	@Override
	public void modificar_update( ) {
		
	}

	@Override
	public List<CProveedor> listar() {
		// TODO Auto-generated method stub
		return pD.listar();
	}

	@Override
	public void eliminar(int c_Proveedor) {
		pD.eliminar(c_Proveedor);
	}
}
