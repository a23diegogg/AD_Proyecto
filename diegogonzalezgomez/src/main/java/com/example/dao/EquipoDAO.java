package com.example.dao;
import javax.persistence.EntityManager;

import com.example.entities.Equipo;

import java.util.List;

public class EquipoDAO {
    private final EntityManager entityManager;

    public EquipoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    //
    public void guardarEquipo(Equipo equipo) {
        entityManager.getTransaction().begin();
        entityManager.persist(equipo);
        entityManager.getTransaction().commit();
    }

    public List<Equipo> obtenerEquipoPorNombre(String nombreEquipo) {
        List<Equipo> equipos = entityManager.createQuery("SELECT e FROM Equipo e WHERE e.nombreCompleto LIKE :nombre", Equipo.class)
                .setParameter("nombre", "%" + nombreEquipo + "%")
                .getResultList();
        return equipos;
    }

    public List<Equipo> obtenerTodosEquipos() {
        List<Equipo> equipos = entityManager.createQuery("SELECT e FROM Equipo e", Equipo.class).getResultList();
        return equipos;
    }

    public void actualizarEquipo(Equipo equipo) {
        entityManager.getTransaction().begin();
        entityManager.merge(equipo);
        entityManager.getTransaction().commit();
    }

}
