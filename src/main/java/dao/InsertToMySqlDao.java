package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.InsertToMySql;

public class InsertToMySqlDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("abc");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	public void insert(InsertToMySql insertToMySql) {
		entityTransaction.begin();
		entityManager.persist(insertToMySql);
		entityTransaction.commit();
	}
}
