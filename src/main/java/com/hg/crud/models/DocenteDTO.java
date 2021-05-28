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
}
