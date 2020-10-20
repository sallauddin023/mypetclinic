package com.springframework.mypetclinic.Services.Map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Speciality;
import com.springframework.mypetclinic.Model.Vet;
import com.springframework.mypetclinic.Services.SpecialityService;
import com.springframework.mypetclinic.Services.VetService;

@Service
public class VetServiceMap extends AbstractMapServices<Vet,Long> implements VetService {
	private final SpecialityService specialityService;
	
	
    public VetServiceMap(SpecialityService specialityService) {
	super();
	this.specialityService = specialityService;
}
@Override
    public Set<Vet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet save(Vet object) {
    	if(object.getSpeialities().size() >0) {
    		object.getSpeialities().forEach(specialities ->{
    			if(specialities.getId() == null) {
    				Speciality savedSpeciality = specialityService.save(specialities);
    				specialities.setId(savedSpeciality.getId());
    			}
    		});
    	}
        return super.save(object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
