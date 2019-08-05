package yonatangross.spring.sfpetclinic.services;

import yonatangross.spring.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
