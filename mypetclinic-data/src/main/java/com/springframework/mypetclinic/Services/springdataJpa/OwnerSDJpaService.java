package com.springframework.mypetclinic.Services.springdataJpa;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Owner;
import com.springframework.mypetclinic.Services.OwnerService;
import com.springframework.mypetclinic.repositories.OwnerRepository;
import com.springframework.mypetclinic.repositories.PetRepository;
import com.springframework.mypetclinic.repositories.PetTypeRepository;

@Service
public class OwnerSDJpaService implements OwnerService{

	private final OwnerRepository ownerRepository;
	private final PetRepository petRepository;
	private final PetTypeRepository petTypeRepository;
	
	
	
	public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
			PetTypeRepository petTypeRepository) {
		super();
		this.ownerRepository = ownerRepository;
		this.petRepository = petRepository;
		this.petTypeRepository = petTypeRepository;
	}

	@Override
	public Set<Owner> findAll() {
		Set<Owner> owners = new HashSet<>();
		
		ownerRepository.findAll().forEach(owners::add);
		return owners;
	}

	@Override
	public Owner findById(Long id) {
		// TODO Auto-generated method stub
		Optional<Owner> optionalOwner =  ownerRepository.findById(id);
//		if(optionalOwner.isPresent()) {
//			return optionalOwner.get();
//		}else {
//			return null;
//		}
		
		return optionalOwner.orElse(null);
	}

	@Override
	public Owner save(Owner object) {
		// TODO Auto-generated method stub
		return ownerRepository.save(object);
	}

	@Override
	public void delete(Owner object) {
		// TODO Auto-generated method stub
		ownerRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ownerRepository.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		// TODO Auto-generated method stub
		return ownerRepository.findBylastName(lastName);
	}

	
}
