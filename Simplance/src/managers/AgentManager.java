package managers;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import sun.management.Agent;

@Stateless
@LocalBean
public class AgentManager {

	@PersistenceContext 
	EntityManager em;
	
	public List<Agent> all(){
		TypedQuery<Agent> agents = em.createQuery("SELECT a FROM Agent a", Agent.class);
		return agents.getResultList();
	}
	
	public Agent byId(int id){
		return em.find(Agent.class, id);
	}
	
	public Agent create(Agent a){
		em.persist(a);
		return a;
	}
	
	public Agent update(Agent a){
		em.merge(a);
		return a;
	}
	
	public void delete(int id){
		em.remove(byId(id));
	}
}
