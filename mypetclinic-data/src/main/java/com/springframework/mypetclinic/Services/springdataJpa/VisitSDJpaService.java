package com.springframework.mypetclinic.Services.springdataJpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Visit;
import com.springframework.mypetclinic.Services.VisitService;
import com.springframework.mypetclinic.repositories.VisitRepository;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {
	
	private final VisitRepository visitRepository;

	public VisitSDJpaService(VisitRepository visitRepository) {
		super();
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		Set<Visit> visits = new HashSet<>();
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		// TODO Auto-generated method stub
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
		visitRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		visitRepository.existsById(id);
	}
	
	

}
