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

@Document(collection = "experimentosestudiantes")

public class ExperimentoEstudianteDTO {
    
    @Id
    private String id;
    private String idExperimento;
    private String idEstudiante;
    private String datoSensor;
    private String respuestaExperimento;
    private String fecha;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdExperimento() {
        return idExperimento;
    }

    public void setIdExperimento(String idExperimento) {
        this.idExperimento = idExperimento;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(String idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getDatoSensor() {
        return datoSensor;
    }

    public void setDatoSensor(String datoSensor) {
        this.datoSensor = datoSensor;
    }

    public String getRespuestaExperimento() {
        return respuestaExperimento;
    }

    public void setRespuestaExperimento(String respuestaExperimento) {
        this.respuestaExperimento = respuestaExperimento;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
}
