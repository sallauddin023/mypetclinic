package com.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.mypetclinic.Model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {

}
