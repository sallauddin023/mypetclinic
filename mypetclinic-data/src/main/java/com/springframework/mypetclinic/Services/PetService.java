package com.springframework.mypetclinic.Services;



import com.springframework.mypetclinic.Model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
