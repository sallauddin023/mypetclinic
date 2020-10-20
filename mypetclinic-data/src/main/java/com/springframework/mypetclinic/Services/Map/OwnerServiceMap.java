package com.springframework.mypetclinic.Services.Map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Owner;
import com.springframework.mypetclinic.Model.Pet;
import com.springframework.mypetclinic.Services.OwnerService;
import com.springframework.mypetclinic.Services.PetService;
import com.springframework.mypetclinic.Services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapServices<Owner,Long> implements OwnerService {
    
	private final PetTypeService petTypeService;
	private final PetService petService;
	
	
	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
		super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
    public Set<Owner> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
     super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
    	
    	if(object !=null) {
    		if(object.getPets()!=null) {
    			object.getPets().forEach(pet ->{
    				if(pet.getPetType().getId() != null) {
    					pet.setPetType(petTypeService.save(pet.getPetType()));
    				}else {
    					throw new RuntimeException("Pet type is required");
    				}
    				if(pet.getId() == null) {
    					Pet savedPet = petService.save(pet); 
    					pet.setId(savedPet.getId());
    				}
    			});
    		}
    		return super.save(object);
    	}else {
    		return null;
    	}
        
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }
    @Override
    public Owner findByLastName(String lastName) {
    	return null;
    }
}
