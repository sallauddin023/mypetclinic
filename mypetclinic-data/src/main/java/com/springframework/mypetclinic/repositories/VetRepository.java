package com.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.mypetclinic.Model.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {

}
