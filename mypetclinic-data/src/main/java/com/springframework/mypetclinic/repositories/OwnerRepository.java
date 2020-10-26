package com.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.mypetclinic.Model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

}
