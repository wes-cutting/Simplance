package managers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Insurance_Policy;

@Stateless
@LocalBean
public class PolicyManager {

	@PersistenceContext
	EntityManager em;
	
	public List<Insurance_Policy> all(){
		TypedQuery<Insurance_Policy> all = em.createQuery("SELECT p FROM Insurance_Policy p", Insurance_Policy.class);
		return all.getResultList();
	}
	
	public Insurance_Policy byId(int id){
		return em.find(Insurance_Policy.class, id);
	}
	
	public Insurance_Policy create(Insurance_Policy ip){
		em.persist(ip);
		return ip;
	}
	
	public Insurance_Policy update(Insurance_Policy ip){
		em.merge(ip);
		return ip;
	}
	
	public void delete(int id){
		em.remove(byId(id));
	}
	
	public List<Insurance_Policy> search(String query){
		ArrayList<Insurance_Policy> specified = new ArrayList<>();
		for (Insurance_Policy ip : all()) {
			if(ip.GetDescription().contains(query) || ip.GetName().contains(query))
				specified.add(ip);
		}
		return specified;
	}
}
