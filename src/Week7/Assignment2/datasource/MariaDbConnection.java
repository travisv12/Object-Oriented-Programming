package Week7.Assignment2.datasource;

package datasource;

import jakarta.persistence.*;

public class MariaDbConnection {

    private static EntityManagerFactory emf = null;
    private static EntityManager em = null;

    public static EntityManager getInstance() {
        // you need to add synchronization if you run in a multi-threaded environment

        if (em==null) {
            if (emf==null) {
                emf = Persistence.createEntityManagerFactory("CurrencyConverterPU");
            }
            em = emf.createEntityManager();
        }
        return em;
    }
}