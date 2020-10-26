package com.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.mypetclinic.Model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {

}
