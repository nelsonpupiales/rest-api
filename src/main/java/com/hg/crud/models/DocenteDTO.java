/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 *
 * @author nelso
 */

@Document(collection = "docentes")

public class DocenteDTO {
    @Id
    private String id;
    private String nombreDocente;
    private String apellidoDocente;
    private String correoDocente;
    public String userDocente;
    private String passDocente;   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public String getApellidoDocente() {
        return apellidoDocente;
    }

    public void setApellidoDocente(String apellidoDocente) {
        this.apellidoDocente = apellidoDocente;
    }

    public String getCorreoDocente() {
        return correoDocente;
    }

    public void setCorreoDocente(String correoDocente) {
        this.correoDocente = correoDocente;
    }

    public String getUserDocente() {
        return userDocente;
    }

    public void setUserDocente(String userDocente) {
        this.userDocente = userDocente;
    }

    public String getPassDocente() {
        return passDocente;
    }

    public void setPassDocente(String passDocente) {
        this.passDocente = passDocente;
    }
}
