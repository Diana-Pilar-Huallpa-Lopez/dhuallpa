package edu.ilp.dhuallpa.util;

import edu.ilp.dhuallpa.entity.Asignatura;
import jakarta.persistence.EntityManager;

import java.util.*;

public class ListarAsignatura {

    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();

        List<Asignatura> asignaturaList = entityManager.createQuery("SELECT c FROM asignatura c",Asignatura.class).getResultList();

        for (Asignatura asignatura: asignaturaList){
            System.out.println(asignatura);
        }
        entityManager.close();
    }
}
