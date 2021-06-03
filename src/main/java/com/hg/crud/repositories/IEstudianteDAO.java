/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.repositories;

import com.hg.crud.models.EstudianteDTO;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nelso
 */
public interface IEstudianteDAO extends MongoRepository<EstudianteDTO , Integer>{
    
    public void deleteById(String id);  
    
    public Optional<EstudianteDTO> findById(String id);
     
    public Optional<EstudianteDTO> findByusuarioEstudiante(String usuarioEstudiante);
                
    //public List<Estudiante> findByIdTema(String id);
}
