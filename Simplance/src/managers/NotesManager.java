package managers;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entities.Note;

@Stateless
@LocalBean
public class NotesManager {

	@PersistenceContext
	EntityManager em;
	
	public List<Note> all(){
		TypedQuery<Note> all = em.createQuery("SELECT n FROM Note n", Note.class);
		return all.getResultList();
	}
	
	public List<Note> search(String query){
		ArrayList<Note> search = new ArrayList<>();
		for(Note n : all()){
			if(n.GetBody().contains(query) || n.GetSubject().contains(query))
				search.add(n);
		}
		return search;
	}
	
}
