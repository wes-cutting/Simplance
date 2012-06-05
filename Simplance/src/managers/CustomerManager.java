package managers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Customer;

@Stateless
@LocalBean
public class CustomerManager {
	@PersistenceContext
	EntityManager em;

	public List<Customer> all() {
		TypedQuery<Customer> all = em.createQuery("SELECT c FROM Customer c",
				Customer.class);
		return all.getResultList();
	}

	public List<Customer> allActive() {
		List<Customer> all = all();
		ArrayList<Customer> active = new ArrayList<>();

		for (Customer c : all) {
			if (c.GetIsActive())
				active.add(c);
		}
		return active;
	}

	public List<Customer> allContracted() {
		List<Customer> all = all();
		ArrayList<Customer> contracted = new ArrayList<>();

		for (Customer c : all) {
			if (c.GetIsContracted())
				contracted.add(c);
		}
		return contracted;
	}

	public Customer byId(int id) {
		return em.find(Customer.class, id);
	}

	public Customer create(Customer c) {
		em.persist(c);
		return c;
	}

	public Customer update(Customer c) {
		em.merge(c);
		return c;
	}

	public void delete(Customer c) {
		em.remove(c);
	}

	public List<Customer> search(String query) {
		ArrayList<Customer> specified = new ArrayList<>();
		for (Customer c : all()) {
			if (c.GetFirstName().contains(query)
					|| c.GetLastName().contains(query)
					|| c.GetEmail().contains(query))
				specified.add(c);
		}
		return specified;
	}

}
