/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.controllers;

import com.hg.crud.models.EstudianteDTO;
import com.hg.crud.repositories.IEstudianteDAO;
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
 * @author nelso
 */

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })

@RequestMapping("/api/estudiantes")

public class EstudianteController {
   
    @Autowired
    private IEstudianteDAO repository; 
    
    @PostMapping("/guardarEstudiante")
    public String saveEstudiante(@RequestBody EstudianteDTO estudiante) {
        
        
        //------------SEGURIDAD PARA ENCRIPTAR CLAVE--------------
        //SecureRandom random = new SecureRandom();
        //byte[] salt = new byte[16];
        //random.nextBytes(salt);
        //String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));        
        //http://www.mindrot.org/projects/jBCrypt/
        //https://javalibs.com/artifact/org.mindrot/jbcrypt
        
        
        
        repository.save(estudiante);
        System.out.println("estos son los datos de estudiante");
        System.out.println(estudiante.toString());
        System.out.println("--------");
	System.out.println("Se creo nuevo estudiante con el ID = " + estudiante.getId()+ "...");
        return "Experimento agregado con la identificación: " + estudiante.getId();                
    }
    
    //Obtener valores de Docente por medio del userDocente
    @GetMapping("/loginEstudiante/{usuarioEstudiante}")
    public Optional<EstudianteDTO> getOneUser(@PathVariable String usuarioEstudiante) {   
	System.out.println("Usuario:" + usuarioEstudiante);
        return repository.findByusuarioEstudiante(usuarioEstudiante);                
    }
    
    //Obtener valores de Docente por medio del userDocente
    @GetMapping("/cargaEstudiante/{id}")
    public Optional<EstudianteDTO> getOneId(@PathVariable String id) {   
	System.out.println("Estudiante:" + id);
        return repository.findById(id) ;
    }
    
}
