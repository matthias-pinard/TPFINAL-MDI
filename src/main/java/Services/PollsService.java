package Services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Event;
import jpa.EntityManagerHelper;

public class PollsService {
	
	public PollsService() {
		
	}
	
	public void createPolls(Event polls) {
		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();


		try {
			manager.persist(polls);
			manager.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();
		//manager.close();
	}
	
	public List<Event> getPolls() {
		EntityManager entityManager = EntityManagerHelper.getEntityManager();
		List<Event> lEvents = entityManager.createQuery("Select a from Event a", Event.class).getResultList();
		return lEvents;
	}

	public Event getPoll(Long id) {
		EntityManager entityManager = EntityManagerHelper.getEntityManager();
		Event event = entityManager.getReference(Event.class, id);
		EntityManagerHelper.closeEntityManager();
		return event;
	}
	
}
