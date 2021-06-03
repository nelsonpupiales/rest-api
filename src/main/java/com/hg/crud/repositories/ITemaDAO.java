/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.repositories;

import com.hg.crud.models.TemaDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nelso
 */
public interface ITemaDAO extends MongoRepository<TemaDTO, String> {
    public void deleteById(String id);  
    
    public Optional<TemaDTO> findById(String id);
     
    public List<TemaDTO> findByIdMateria(String idMateria);
}
