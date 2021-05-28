/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hg.crud.controllers;

import com.hg.crud.models.ProductDTO;
import com.hg.crud.repositories.IProductDAO;
import java.util.List;
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
 * @author nelso
 */

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.DELETE })
@RequestMapping("/api/docentes")

public class DocenteController {
    
    @Autowired
	private IProductDAO repository;

	@PostMapping("/docente")
	public ProductDTO create(@Validated @RequestBody ProductDTO p) {
		return repository.insert(p);
	}

	@GetMapping("/")
	public List<ProductDTO> readAll() {
		return repository.findAll();
	}

	@PutMapping("/docente/{id}")
	public ProductDTO update(@PathVariable String id, @Validated @RequestBody ProductDTO p) {
		return repository.save(p);
	}

	@DeleteMapping("/docente/{id}")
	public void delete(@PathVariable String id) {
		repository.deleteById(id);
	}
}
