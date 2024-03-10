package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Jugador")
public class Jugador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idJugador;

    private String nombre;
    private String apellido;
    private String posicion;
    private Integer peso;
    private Integer anoDraft;
    private Integer rondaDraft;
    private Integer altura;

    @ManyToOne
    @JoinColumn(name = "idEquipo")
    private Equipo equipo;

    public Equipo getEquipo() {
        return equipo;
    }
    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
    private String foto;
    private Integer numero;
    private Integer numeroDraft;
    private String colegio;
    private String pais;
    public Long getIdJugador() {
        return idJugador;
    }
    public void setIdJugador(Long idJugador) {
        this.idJugador = idJugador;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getPosicion() {
        return posicion;
    }
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
    public Integer getPeso() {
        return peso;
    }
    public void setPeso(Integer peso) {
        this.peso = peso;
    }
    public Integer getAnoDraft() {
        return anoDraft;
    }
    public void setAnoDraft(Integer anoDraft) {
        this.anoDraft = anoDraft;
    }
    public Integer getRondaDraft() {
        return rondaDraft;
    }
    public void setRondaDraft(Integer rondaDraft) {
        this.rondaDraft = rondaDraft;
    }
    public Integer getAltura() {
        return altura;
    }
    public void setAltura(Integer altura) {
        this.altura = altura;
    }
    public String getFoto() {
        return foto;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Integer getNumeroDraft() {
        return numeroDraft;
    }
    public void setNumeroDraft(Integer numeroDraft) {
        this.numeroDraft = numeroDraft;
    }
    public String getColegio() {
        return colegio;
    }
    public void setColegio(String colegio) {
        this.colegio = colegio;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

}
