package edu.ilp.dhuallpa.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {

    private static final EntityManagerFactory entityManager = buildEntityManagerFactory();

    private static EntityManagerFactory buildEntityManagerFactory(){
        return Persistence.createEntityManagerFactory("examenJPA");
    }

    public static EntityManager getEntityManager(){
        return entityManager.createEntityManager();
    }
}
