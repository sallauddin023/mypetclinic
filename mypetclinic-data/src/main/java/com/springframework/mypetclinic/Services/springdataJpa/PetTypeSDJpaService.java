package com.springframework.mypetclinic.Services.springdataJpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.PetType;
import com.springframework.mypetclinic.Services.PetTypeService;
import com.springframework.mypetclinic.repositories.PetTypeRepository;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {
	
	private final PetTypeRepository petTypeRepository;

	public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
		super();
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		Set<PetType> petTypes = new HashSet<>();
		petTypeRepository.findAll().forEach(petTypes::add);
		return petTypes;
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return petTypeRepository.findById(id).orElse(null);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return petTypeRepository.save(object);
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		petTypeRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		petTypeRepository.deleteById(id);
	}
	
	

}
