package pe.edu.upc.daoimpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IProveedorDao;
import pe.edu.upc.entity.CProveedor;


public class ProveedorDaoImpl implements IProveedorDao, Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CProveedor provee) {
		try {
			em.persist(provee);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CProveedor> listar() {
		List<CProveedor> lista = new ArrayList<CProveedor>();
		try {
			Query q = em.createQuery("select pro from CProveedor pro");
			lista = (List<CProveedor>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}
    @Transactional 
	@Override
	public void eliminar(int c_Proveedor) {
    	CProveedor mot = new CProveedor();
		try {
			mot = em.getReference(CProveedor.class, c_Proveedor);
			em.remove(mot);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
