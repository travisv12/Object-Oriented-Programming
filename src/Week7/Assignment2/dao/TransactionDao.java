package Week7.Assignment2.dao;

import entity.Transaction;
import jakarta.persistence.EntityManager;

public class TransactionDao {
    public EntityManager em = datasource.MariaDbConnection.getInstance();

    public void persist(Transaction transaction) {
        em.getTransaction().begin();
        em.persist(transaction);
        em.getTransaction().commit();
    }
}
