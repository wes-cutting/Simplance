package managers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Phone;

@Stateless
@LocalBean
public class PhoneManager {

	@PersistenceContext
	EntityManager em;

	public List<Phone> all() {
		TypedQuery<Phone> all = em.createQuery("SELECT p FROM Phone p",
				Phone.class);
		return all.getResultList();
	}

	public List<Phone> search(String query) {
		ArrayList<Phone> specified = new ArrayList<>();
		for (Phone p : all()) {
			if (p.GetCell().contains(query) || p.GetHome().contains(query)
					|| p.GetWork().contains(query)
					|| p.GetWork_Ext().contains(query))
				specified.add(p);
		}
		return specified;
	}

}
