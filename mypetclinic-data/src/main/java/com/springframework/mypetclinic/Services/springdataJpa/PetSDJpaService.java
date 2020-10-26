package com.springframework.mypetclinic.Services.springdataJpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Pet;
import com.springframework.mypetclinic.Services.PetService;
import com.springframework.mypetclinic.repositories.PetRepository;

@Service
@Profile("springdatajpa")
public class PetSDJpaService implements PetService {
	
	private final PetRepository PetRepository;

	public PetSDJpaService(com.springframework.mypetclinic.repositories.PetRepository petRepository) {
		super();
		PetRepository = petRepository;
	}

	@Override
	public Set<Pet> findAll() {
		// TODO Auto-generated method stub
		Set<Pet> pets = new HashSet<>();
		PetRepository.findAll().forEach(pets::add);
		return pets;
	}

	@Override
	public Pet findById(Long id) {
		// TODO Auto-generated method stub
		return PetRepository.findById(id).orElse(null);
	}

	@Override
	public Pet save(Pet object) {
		// TODO Auto-generated method stub
		return PetRepository.save(object);
	}

	@Override
	public void delete(Pet object) {
		// TODO Auto-generated method stub
		PetRepository.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		PetRepository.deleteById(id);
	}
	

}
