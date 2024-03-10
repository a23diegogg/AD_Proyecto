package com.example.entities;

import com.example.entities.Equipo;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-08T21:34:59", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Jugador.class)
public class Jugador_ { 

    public static volatile SingularAttribute<Jugador, Integer> anoDraft;
    public static volatile SingularAttribute<Jugador, Integer> numero;
    public static volatile SingularAttribute<Jugador, Integer> peso;
    public static volatile SingularAttribute<Jugador, String> nombre;
    public static volatile SingularAttribute<Jugador, String> pais;
    public static volatile SingularAttribute<Jugador, String> posicion;
    public static volatile SingularAttribute<Jugador, Long> idJugador;
    public static volatile SingularAttribute<Jugador, String> foto;
    public static volatile SingularAttribute<Jugador, Integer> altura;
    public static volatile SingularAttribute<Jugador, Integer> numeroDraft;
    public static volatile SingularAttribute<Jugador, String> apellido;
    public static volatile SingularAttribute<Jugador, Equipo> equipo;
    public static volatile SingularAttribute<Jugador, Integer> rondaDraft;
    public static volatile SingularAttribute<Jugador, String> colegio;

}