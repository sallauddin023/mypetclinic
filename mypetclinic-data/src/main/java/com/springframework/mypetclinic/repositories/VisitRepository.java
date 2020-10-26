package com.springframework.mypetclinic.repositories;

import org.springframework.data.repository.CrudRepository;

import com.springframework.mypetclinic.Model.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {

}
