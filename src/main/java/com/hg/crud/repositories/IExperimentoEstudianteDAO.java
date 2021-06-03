/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.repositories;

import com.hg.crud.models.ExperimentoEstudianteDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nelso
 */
public interface IExperimentoEstudianteDAO extends MongoRepository<ExperimentoEstudianteDTO , Integer>{
    
    public List<ExperimentoEstudianteDTO> findByIdEstudiante(String idEstudiante);
    
    public List<ExperimentoEstudianteDTO> findByIdExperimento(String idExperimento);
    
    public Optional<ExperimentoEstudianteDTO> findById(String id); 
}
