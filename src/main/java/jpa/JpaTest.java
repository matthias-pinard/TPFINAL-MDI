package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import entities.Polls;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		EntityManager manager = EntityManagerHelper.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();


		try {
			Polls polls = new Polls();
			polls.setName("testPolls");
			manager.persist(polls);
		} catch (Exception e) {
			e.printStackTrace();
		}
		tx.commit();

		List<Polls> lPolls = manager.createQuery("Select a from Polls a", Polls.class).getResultList();
		System.out.println(lPolls);
		manager.close();
		EntityManagerHelper.closeEntityManagerFactory();
		//		factory.close();
	}


}
