/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.controllers;

import com.hg.crud.models.MateriaDTO;
import com.hg.crud.repositories.IMateriaDAO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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


@RequestMapping("/api/materias")

public class MateriaController {
    
    @Autowired
    private IMateriaDAO repository;
    

    //Almacena información de la Materia
    @PostMapping("/guardarMateria")
    public String saveMateria(@RequestBody MateriaDTO materia) {
        repository.save(materia);
        System.out.println("Se creo nuevo materia con el ID = " + materia.getId() + "...");
        return "Su materia fue agregada: " + materia.getId();
    }

    //Obtengo las materias del Docente que va dictar
    @GetMapping("/cargarMaterias/{idDocente}")
    public List<MateriaDTO> getTemaIdDocente(@PathVariable String idDocente) {
        return repository.findByIdDocente(idDocente);
    }
          
        
    //Carga una sola materia por el ID
    @GetMapping("/detalleUnaMateria/{id}")
    public Optional<MateriaDTO> getOneMateria(@PathVariable String id) {      
        System.out.println("Se ha seleccionado una sola materia con el ID = " + id + "...");
        return repository.findById(id);            
    }
    
    
    //Borra una materiaa
    @DeleteMapping("/borrarMateria/{id}")
    public ResponseEntity<String> deleteMateria(@PathVariable("id") String id) {
        System.out.println("Se elimino la materia con el ID = " + id + "...");
        repository.deleteById(id);
        return new ResponseEntity<>("La materia ha sido eliminado!", HttpStatus.OK);
    }
      
    
    
    //---------------------------------------------  MOVIL  ---------------------------------------------
    
          
    //Carga una sola materia por el CODIGO
    @GetMapping("/detalleCodeMateria/{codigoMateria}")
    public Optional<MateriaDTO> getOnecodigoMateria(@PathVariable String codigoMateria) {      
        System.out.println("Se ha seleccionado una sola materia con el ID = " + codigoMateria + "...");
        return repository.findBycodigoMateria(codigoMateria);            
    }

    
    
    //Carga lista de materias por el Codigo Materia
    @GetMapping("/CodeMateriaList/{id}")
    public List<MateriaDTO> getCodigoMateria(@PathVariable String id) {
        return repository.findByid(id);
    }
}
