package com.springframework.mypetclinic.Services.Map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Speciality;
import com.springframework.mypetclinic.Services.SpecialityService;

@Service
@Profile({"default","map"})
public class SpecialityMapService extends AbstractMapServices<Speciality, Long> implements SpecialityService{

	@Override
	public Set<Speciality> findall() {
		// TODO Auto-generated method stub
		return super.findall();
	}

	@Override
	public Speciality findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Speciality save(Speciality object) {
		// TODO Auto-generated method stub
		return super.save(object);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Speciality object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}

	@Override
	public Set<Speciality> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
