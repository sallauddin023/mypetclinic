package com.springframework.mypetclinic.Services.Map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.PetType;
import com.springframework.mypetclinic.Services.PetTypeService;

@Service
@Profile({"default","map"})
public class PetTypeMapService extends AbstractMapServices<PetType, Long> implements PetTypeService {

	@Override
	public Set<PetType> findall() {
		// TODO Auto-generated method stub
		return super.findall();
	}

	@Override
	public PetType findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public PetType save(PetType object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(PetType object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Set<PetType> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
