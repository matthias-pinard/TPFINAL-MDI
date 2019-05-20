package Services;

import java.util.List;

import javax.persistence.EntityManager;

import entities.Polls;
import jpa.EntityManagerHelper;

public class PollsService {
	
	public PollsService() {
		
	}
	
	public void createPolls(Polls polls) {
		EntityManager entityManager = EntityManagerHelper.getEntityManager();
		EntityManagerHelper.beginTransaction();
		entityManager.persist(polls);
		EntityManagerHelper.commit();
		EntityManagerHelper.closeEntityManager();
	}
	
	public List<Polls> getPolls() {
		EntityManager entityManager = EntityManagerHelper.getEntityManager();
		List<Polls> lPolls = entityManager.createQuery("Select a from Polls a", Polls.class).getResultList();
		EntityManagerHelper.closeEntityManager();
		return lPolls;
	}
	
}
