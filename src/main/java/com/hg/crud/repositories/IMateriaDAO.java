/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.repositories;

import com.hg.crud.models.MateriaDTO;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author nelso
 */
public interface IMateriaDAO extends MongoRepository<MateriaDTO, String>{
    
    @Override
     public void deleteById(String id);

    @Override
    public Optional<MateriaDTO> findById(String id); 
        
    public Optional<MateriaDTO> findBycodigoMateria(String codigoMateria);
        
    public List<MateriaDTO> findByIdDocente(String idDocente);
    
    public List<MateriaDTO> findByid(String id);
}
