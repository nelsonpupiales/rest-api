/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.controllers;

import com.hg.crud.models.TemaDTO;
import com.hg.crud.repositories.ITemaDAO;
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


@RequestMapping("/api/temas")
public class TemaController {
    @Autowired
   private ITemaDAO repository; 
   
   
    @PostMapping("/guardarTema")
    public String saveTema(@RequestBody TemaDTO tema) {        
        repository.save(tema);
	System.out.println("Se creo nuevo tema con el ID = " + tema.getId()+ "...");
        return "Tema agregado con la identificación: " + tema.getId();                
    }     
    
    //Obtengo todos los temas de una materia especifico se lo obtiene con el idMateria
    @GetMapping("/cargarTemas/{idMateria}")
    public List<TemaDTO> getTemaIdMateria(@PathVariable String idMateria) {
        return repository.findByIdMateria(idMateria);
    }
    
    //Carga un solo tema por el ID
    @GetMapping("/cargaUnTema/{id}")
    public Optional<TemaDTO> getOneTema(@PathVariable String id) {      
        System.out.println("Se ha seleccionado solo tema con el ID = " + id + "...");
        return repository.findById(id);            
    }
    
    //Borra una materiaa
    @DeleteMapping("/borrarTema/{id}")
    public ResponseEntity<String> deleteTema(@PathVariable("id") String id) {
        System.out.println("Se elimino tema con el ID = " + id + "...");
        repository.deleteById(id);
        return new ResponseEntity<>("El tema ha sido eliminado!", HttpStatus.OK);
    }
}
