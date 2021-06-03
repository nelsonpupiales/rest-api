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
 * @author nelson pupiales
 */

@Document(collection = "temas")
public class TemaDTO {
    @Id
    private String id;
    private String nombreTema;
    private String introduccionTema;
    private String instruccionesTema;
    private String bibliografiaTema;
    private String idMateria;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreTema() {
        return nombreTema;
    }

    public void setNombreTema(String nombreTema) {
        this.nombreTema = nombreTema;
    }

    public String getIntroduccionTema() {
        return introduccionTema;
    }

    public void setIntroduccionTema(String introduccionTema) {
        this.introduccionTema = introduccionTema;
    }

    public String getInstruccionesTema() {
        return instruccionesTema;
    }

    public void setInstruccionesTema(String instruccionesTema) {
        this.instruccionesTema = instruccionesTema;
    }

    public String getBibliografiaTema() {
        return bibliografiaTema;
    }

    public void setBibliografiaTema(String bibliografiaTema) {
        this.bibliografiaTema = bibliografiaTema;
    }

    public String getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(String idMateria) {
        this.idMateria = idMateria;
    }
}
