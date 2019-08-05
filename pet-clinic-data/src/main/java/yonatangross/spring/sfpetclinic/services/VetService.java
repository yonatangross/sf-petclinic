package yonatangross.spring.sfpetclinic.services;

import yonatangross.spring.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
