package managers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Address;

@Stateless
@LocalBean
public class AddressManager {

	@PersistenceContext
	EntityManager em;

	public List<Address> all() {
		TypedQuery<Address> all = em.createQuery("SELECT a FROM Address a",
				Address.class);
		return all.getResultList();
	}

	public List<Address> search(String query) {
		ArrayList<Address> specified = new ArrayList<>();
		for (Address a : all()) {
			if (a.GetCity().contains(query) || a.GetState().contains(query)
					|| a.GetStreetAddress().contains(query)
					|| a.GetZip().contains(query))
				specified.add(a);
		}
		return specified;
	}

}
