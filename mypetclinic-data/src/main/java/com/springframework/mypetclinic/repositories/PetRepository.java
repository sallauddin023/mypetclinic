package com.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.mypetclinic.Model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long>{

}
