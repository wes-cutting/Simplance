package managers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Sale;

@Stateless
@LocalBean
public class SaleManager {

	@PersistenceContext
	EntityManager em;

	public List<Sale> all() {
		TypedQuery<Sale> all = em.createQuery("SELECT s FROM Sale s",
				Sale.class);
		return all.getResultList();
	}
	
	public Sale byId(int id){
		return em.find(Sale.class, id);
	}

	public Sale create(Sale s) {
		em.persist(s);
		return s;
	}

	public Sale update(Sale s) {
		em.merge(s);
		return s;
	}

	public void delete(Sale s) {
		em.remove(s);
	}
	
	public List<Sale> search(String query){
		ArrayList<Sale> specified = new ArrayList<>();
		for(Sale s : all()){
			if(s.GetComments().contains(query) || s.GetPremiumNumber().contains(query) || (s.GetTerm() + "").contains(query))
				specified.add(s);
		}
		return specified;
	}
}
