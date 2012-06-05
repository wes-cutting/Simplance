package managers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Agent;

@Stateless
@LocalBean
public class AgentManager {

	@PersistenceContext
	EntityManager em;

	public List<Agent> all() {
		TypedQuery<Agent> agents = em.createQuery("SELECT a FROM Agent a",
				Agent.class);
		return agents.getResultList();
	}

	public Agent byId(int id) {
		return em.find(Agent.class, id);
	}

	public Agent create(Agent a) {
		em.persist(a);
		return a;
	}

	public Agent update(Agent a) {
		em.merge(a);
		return a;
	}

	public void delete(int id) {
		em.remove(byId(id));
	}

	public List<Agent> search(String query) {
		ArrayList<Agent> specified = new ArrayList<>();
		for (Agent a : all()) {
			if (a.GetFirstName().contains(query)
					|| a.GetLastName().contains(query)
					|| a.GetEmail().contains(query))
				specified.add(a);
		}
		return specified;
	}
}
