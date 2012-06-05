package managers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Insurance_Carrier;

@Stateless
@LocalBean
public class CarrierManager {

	@PersistenceContext
	EntityManager em;

	public List<Insurance_Carrier> all() {
		TypedQuery<Insurance_Carrier> all = em.createQuery(
				"SELECT i FROM Insurance_Carrier i", Insurance_Carrier.class);
		return all.getResultList();
	}

	public Insurance_Carrier byId(int id) {
		return em.find(Insurance_Carrier.class, id);
	}

	public Insurance_Carrier create(Insurance_Carrier ic) {
		em.persist(ic);
		return ic;
	}

	public Insurance_Carrier update(Insurance_Carrier ic) {
		em.merge(ic);
		return ic;
	}

	public void delete(int id) {
		em.remove(byId(id));
	}

	public List<Insurance_Carrier> search(String query) {
		ArrayList<Insurance_Carrier> specified = new ArrayList<>();
		for (Insurance_Carrier ic : all()) {
			if (ic.GetName().contains(query))
				specified.add(ic);
		}
		return specified;
	}
}