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

@Document(collection = "experimentos")

public class ExperimentoDTO {
    
    @Id
    private String id;
    private String nombreExperimento;
    private String preguntaExperimento;
    private String dataExperimento;
    private String labelExperimento;
    private String idTema;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreExperimento() {
        return nombreExperimento;
    }

    public void setNombreExperimento(String nombreExperimento) {
        this.nombreExperimento = nombreExperimento;
    }

    public String getPreguntaExperimento() {
        return preguntaExperimento;
    }

    public void setPreguntaExperimento(String preguntaExperimento) {
        this.preguntaExperimento = preguntaExperimento;
    }

    public String getDataExperimento() {
        return dataExperimento;
    }

    public void setDataExperimento(String dataExperimento) {
        this.dataExperimento = dataExperimento;
    }

    public String getLabelExperimento() {
        return labelExperimento;
    }

    public void setLabelExperimento(String labelExperimento) {
        this.labelExperimento = labelExperimento;
    }

    public String getIdTema() {
        return idTema;
    }

    public void setIdTema(String idTema) {
        this.idTema = idTema;
    }
    
    
}
