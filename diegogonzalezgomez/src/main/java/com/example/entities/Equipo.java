package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Equipo")
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipo;

    private String abreviatura;
    private String ciudad;
    private String conferencia;
    private String division;
    private String nombreCompleto;
    private String nombre;
    public Long getIdEquipo() {
        return idEquipo;
    }
    public void setIdEquipo(Long idEquipo) {
        this.idEquipo = idEquipo;
    }
    public String getAbreviatura() {
        return abreviatura;
    }
    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    public String getConferencia() {
        return conferencia;
    }
    public void setConferencia(String conferencia) {
        this.conferencia = conferencia;
    }
    public String getDivision() {
        return division;
    }
    public void setDivision(String division) {
        this.division = division;
    }
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

}
