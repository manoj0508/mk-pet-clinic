package com.springlearn.mkpetclinic.service;

import com.springlearn.mkpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
