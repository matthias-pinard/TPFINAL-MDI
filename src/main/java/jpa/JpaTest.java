package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entities.Event;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();


		try {
			Event polls = new Event();
			polls.setName("testPolls");
			manager.persist(polls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		List<Event> lEvents = manager.createQuery("Select a from Polls a", Event.class).getResultList();
		System.out.println(lEvents);
		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
