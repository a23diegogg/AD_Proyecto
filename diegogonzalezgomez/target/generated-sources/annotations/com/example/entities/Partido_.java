package com.example.entities;

import com.example.entities.Equipo;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-03-08T21:27:59", comments="EclipseLink-2.7.10.v20211216-rNA")
@StaticMetamodel(Partido.class)
public class Partido_ { 

    public static volatile SingularAttribute<Partido, LocalDate> fecha;
    public static volatile SingularAttribute<Partido, String> estado;
    public static volatile SingularAttribute<Partido, Boolean> postemporada;
    public static volatile SingularAttribute<Partido, Integer> periodo;
    public static volatile SingularAttribute<Partido, LocalTime> tiempo;
    public static volatile SingularAttribute<Partido, Integer> temporada;
    public static volatile SingularAttribute<Partido, Equipo> idEquipoVisitante;
    public static volatile SingularAttribute<Partido, Long> idPartido;
    public static volatile SingularAttribute<Partido, Equipo> idEquipoLocal;
    public static volatile SingularAttribute<Partido, Integer> puntosVisitante;
    public static volatile SingularAttribute<Partido, Integer> puntosLocal;

}