package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPuestoDao;
import pe.edu.upc.entity.CPuesto;


public class PuestoDaoImpl implements IPuestoDao ,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CPuesto C_CPuesto) {
		try {
			em.persist(C_CPuesto);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CPuesto> listar() {
		List<CPuesto> lista = new ArrayList<CPuesto>();
		try {
			Query q = em.createQuery("select ps from CPuesto ps");
			lista = (List<CPuesto>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	return lista;
		
	}

	@Override
	public void eliminar(int C_CPuesto) {
		CPuesto mot = new CPuesto();
		try {
			mot = em.getReference(CPuesto.class, C_CPuesto);
			em.remove(mot);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
		
	}


