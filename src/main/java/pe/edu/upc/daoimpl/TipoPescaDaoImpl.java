package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoPescaDao;
import pe.edu.upc.entity.CTipoPesca;

public class TipoPescaDaoImpl implements ITipoPescaDao,Serializable{

	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "IncaMar")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(CTipoPesca provee) {
		try {
			em.persist(provee);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<CTipoPesca> listar() {
		List<CTipoPesca> lista = new ArrayList<CTipoPesca>();
		try {
			Query q = em.createQuery("select tip from CTipoPesca tip");
			lista = (List<CTipoPesca>) q.getResultList();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return lista;
	}
    @Transactional 
	@Override
	public void eliminar(int c_Pesca) {
    	CTipoPesca mot = new CTipoPesca();
		try {
			mot = em.getReference(CTipoPesca.class, c_Pesca);
			em.remove(mot);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
