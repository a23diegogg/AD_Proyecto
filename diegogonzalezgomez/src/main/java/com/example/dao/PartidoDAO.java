package com.example.dao;

import javax.persistence.EntityManager;

import com.example.entities.Equipo;
import com.example.entities.Jugador;
import com.example.entities.Partido;

import java.util.List;

public class PartidoDAO {
    private final EntityManager entityManager;

    public PartidoDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void guardarPartido(Partido partido) {
        entityManager.getTransaction().begin();
        entityManager.persist(partido);
        entityManager.getTransaction().commit();
    }

    public List<Partido> obtenerPartidoPorNombre(int nombre) {
        List<Partido> partidos = entityManager.createQuery("SELECT p FROM Partido p WHERE p.idPartido LIKE :nombre", Partido.class)
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();
                return partidos;
        
    }

    public List<Partido> obtenerTodosPartidos() {
        List<Partido> partidos = entityManager.createQuery("SELECT p FROM Partido p", Partido.class).getResultList();
        return partidos;
    }

    public void actualizarPartido(Partido partido) {
        entityManager.getTransaction().begin();
        entityManager.merge(partido);
        entityManager.getTransaction().commit();
    }

}
