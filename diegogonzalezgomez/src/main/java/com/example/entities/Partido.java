package com.example.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Partido")
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPartido;


    @ManyToOne
    @JoinColumn(name = "idEquipoLocal")
    private Equipo idEquipoLocal;

    @ManyToOne
    @JoinColumn(name = "idEquipoVisitante")
    private Equipo idEquipoVisitante;

    private Integer temporada;
    private Integer periodo;
    private String estado;
    private LocalTime tiempo;
    private Boolean postemporada;
    private Integer puntosLocal;
    private Integer puntosVisitante;
    private LocalDate fecha;
	public Long getIdPartido() {
		return idPartido;
	}
	public void setIdPartido(Long idPartido) {
		this.idPartido = idPartido;
	}
	public Equipo getIdEquipoLocal() {
		return idEquipoLocal;
	}
	public void setIdEquipoLocal(Equipo idEquipoLocal) {
		this.idEquipoLocal = idEquipoLocal;
	}
	public Equipo getIdEquipoVisitante() {
		return idEquipoVisitante;
	}
	public void setIdEquipoVisitante(Equipo idEquipoVisitante) {
		this.idEquipoVisitante = idEquipoVisitante;
	}
	public Integer getTemporada() {
		return temporada;
	}
	public void setTemporada(Integer temporada) {
		this.temporada = temporada;
	}
	public Integer getPeriodo() {
		return periodo;
	}
	public void setPeriodo(Integer periodo) {
		this.periodo = periodo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public LocalTime getTiempo() {
		return tiempo;
	}
	public void setTiempo(LocalTime tiempo) {
		this.tiempo = tiempo;
	}
	public Boolean getPostemporada() {
		return postemporada;
	}
	public void setPostemporada(Boolean postTemporada) {
		this.postemporada = postTemporada;
	}
	public Integer getPuntosLocal() {
		return puntosLocal;
	}
	public void setPuntosLocal(Integer puntosLocal) {
		this.puntosLocal = puntosLocal;
	}
	public Integer getPuntosVisitante() {
		return puntosVisitante;
	}
	public void setPuntosVisitante(Integer puntosVisitante) {
		this.puntosVisitante = puntosVisitante;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


}
