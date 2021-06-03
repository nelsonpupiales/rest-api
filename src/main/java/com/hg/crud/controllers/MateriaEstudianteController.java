/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.controllers;

import com.hg.crud.models.MateriaEstudianteDTO;
import com.hg.crud.repositories.IMateriaEstudianteDAO;
import java.util.List;
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


@RequestMapping("/api/materiasestudiantes")

public class MateriaEstudianteController {
    
    @Autowired
    private IMateriaEstudianteDAO repository; 
   
   //Almacena información de la Materia
    @PostMapping("/guardarMateriaEstudiante")
    public String saveMateriaEstudiante(@RequestBody MateriaEstudianteDTO materiaestudiante) {
        repository.save(materiaestudiante);
        System.out.println("estos son los datos de materiaEstudiante");
        System.out.println(materiaestudiante.toString());
        System.out.println("--------");
        System.out.println("Se creo nuevo materiaEstudiante con el ID = " + materiaestudiante.getId() + "...");
        return "Su  materiafue agregada: " + materiaestudiante.getId();
    }
    
    
   //Obtengo los temas de un Libro especifico se lo obtiene con el idLibro
    @GetMapping("/cargaListaMateriasEstudiante/{idEstudiante}")
    public List<MateriaEstudianteDTO> getTemaIdEstudiantes(@PathVariable String idEstudiante) {
        return repository.findByIdEstudiante(idEstudiante);
    }
    
    
    //----------------------------- WEB  -----------------------------
    
    //Obtengo lista de los estudiantes matriculados en una sola materia
    @GetMapping("/cargaListaIdEstudiante/{idMateria}")
    public List<MateriaEstudianteDTO> getIdMateria(@PathVariable String idMateria) {
        return repository.findByIdMateria(idMateria);
    }
}
