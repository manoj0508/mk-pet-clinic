package com.springlearn.mkpetclinic.service;

import com.springlearn.mkpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();

}
