package Week7.Assignment2.dao;

import entity.Currency;
import jakarta.persistence.EntityManager;
import java.util.List;

public class CurrencyDao {
    public EntityManager em = datasource.MariaDbConnection.getInstance();

    public double getExchangeRate(String abbreviation) {
        Currency currency = em.createQuery("SELECT c FROM Currency c WHERE c.abbreviation = :abbreviation", Currency.class)
                .setParameter("abbreviation", abbreviation)
                .getSingleResult();
        return (currency != null) ? currency.getConversionRateToUSD() : -1;
    }

    public List<Currency> getAllCurrencies() {
        List<Currency> currencies = em.createQuery("SELECT c FROM Currency c", Currency.class).getResultList();
        return currencies;
    }

    public Currency getCurrencyByAbbreviation(String abbreviation) {
        Currency currency = em.createQuery("SELECT c FROM Currency c WHERE c.abbreviation = :abbreviation", Currency.class)
                .setParameter("abbreviation", abbreviation)
                .getSingleResult();
        return currency;
    }

    public void persist(Currency currency) {
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }
}