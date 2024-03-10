package com.example.dao;

import javax.persistence.EntityManager;

import com.example.entities.Jugador;

import java.util.List;

public class JugadorDAO {
    private final EntityManager entityManager;

    public JugadorDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    //
    public void guardarJugador(Jugador jugador) {
        entityManager.getTransaction().begin();
        entityManager.persist(jugador);
        entityManager.getTransaction().commit();
    }

    public List<Jugador> obtenerJugadorPorNombre(String nombre) {
        List<Jugador> jugadores = entityManager.createQuery("SELECT j FROM Jugador j WHERE CONCAT(j.nombre, ' ', j.apellido) LIKE :nombre OR j.nombre LIKE :nombre OR j.apellido LIKE :nombre", Jugador.class)
                .setParameter("nombre", "%" + nombre + "%")
                .getResultList();
                return jugadores;
        
    }

    public List<Jugador> obtenerTodosJugadores() {
        List<Jugador> jugadores = entityManager.createQuery("SELECT j FROM Jugador j", Jugador.class).getResultList();
        return jugadores;
    }

    public void actualizarJugador(Jugador jugador) {
        entityManager.getTransaction().begin();
        entityManager.merge(jugador);
        entityManager.getTransaction().commit();
    }

}
