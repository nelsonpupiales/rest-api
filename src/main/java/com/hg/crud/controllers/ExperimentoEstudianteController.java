/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.controllers;

import com.hg.crud.models.ExperimentoEstudianteDTO;
import com.hg.crud.repositories.IExperimentoEstudianteDAO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author nelson pupiales
 */

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })

@RequestMapping("/api/experimentosestudiantes")

public class ExperimentoEstudianteController {
    
     @Autowired
    private IExperimentoEstudianteDAO repository; 
   
//Desarrollo para WEB    
    
//Carga de lista los estudiantes por un experimento
        
    
    @GetMapping("/cargaDatosPracticas/{idEstudiante}")
    public List<ExperimentoEstudianteDTO> getIdEstudiante(@PathVariable String idEstudiante) {
        return repository.findByIdEstudiante(idEstudiante);
    } 
    
    
    

    
//Desarrollo para MOVIL

//Almacena información de las practicas en la tabla ExperimentoEstudiante
    @PostMapping("/guardarExperimentoEstudiante")
    public String saveMateriaEstudiante(@RequestBody ExperimentoEstudianteDTO experimentoestudiante) {
        repository.save(experimentoestudiante);
        System.out.println("Se creo nuevo registro de experimento con el ID = " + experimentoestudiante.getId() + "...");        return "Su practica fue agregada: " + experimentoestudiante.getId();
    }
    
    //Carga lista de materias por el Codigo Materia
    @GetMapping("/cargarPracticas/{idExperimento}")
    public List<ExperimentoEstudianteDTO> getCodigoMateria(@PathVariable String idExperimento) {
        return repository.findByIdExperimento(idExperimento);
    }
    
    //Carga una sola materia por el ID
    @GetMapping("/cargarUnaPractica/{id}")
    public Optional<ExperimentoEstudianteDTO> getOneMateria(@PathVariable String id) {      
        System.out.println("Se ha seleccionado una sola practica con el ID = " + id + "...");
        return repository.findById(id);            
    }
    
}
