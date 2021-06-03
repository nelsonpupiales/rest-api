/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.repositories;

import com.hg.crud.models.MateriaEstudianteDTO;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nelso
 */
public interface IMateriaEstudianteDAO extends MongoRepository<MateriaEstudianteDTO, String>{
    
    public List<MateriaEstudianteDTO> findByIdMateria(String idMateria);
    
    public List<MateriaEstudianteDTO> findByIdEstudiante(String idEstudiante);
}
