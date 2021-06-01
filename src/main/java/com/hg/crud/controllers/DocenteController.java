/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.controllers;

import com.hg.crud.models.DocenteDTO;
import com.hg.crud.repositories.IDocenteDAO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

@RequestMapping("/api/docentes")

public class DocenteController {
    
    @Autowired
    private IDocenteDAO repository;

    @PostMapping("/docentes")
    public DocenteDTO create(@Validated @RequestBody DocenteDTO p) {
	return repository.insert(p);
    }
        
    @PostMapping("/guardarDocente")
    public String saveDocente(@RequestBody DocenteDTO docente) {        
        repository.save(docente);
	System.out.println("Se creo nuevo docente con el ID = " + docente.getId() + "...");
        return "Su información fue agregada: " + docente.getId();                
    }
        
        //Obtener valores de Docente por medio del userDocente
    @GetMapping("/datosDocenteUser/{userDocente}")
    public Optional<DocenteDTO> getOneUser(@PathVariable String userDocente) {   
	System.out.println("Usuario:" + userDocente);
        return repository.findByuserDocente(userDocente);                
    }
    
    //Obtener valores de Docente por medio del userDocente
    @GetMapping("/datosDocentePass/{passDocente}")
    public Optional<DocenteDTO> getOnePass(@PathVariable String passDocente) {   
	System.out.println("Pass:" + passDocente);
        return repository.findBypassDocente(passDocente);                
    }

	@GetMapping("/")
	public List<DocenteDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/docente/{id}")
	public DocenteDTO update(@PathVariable String id, @Validated @RequestBody DocenteDTO p) {
		return repository.save(p);
	}

	@DeleteMapping("/docente/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
