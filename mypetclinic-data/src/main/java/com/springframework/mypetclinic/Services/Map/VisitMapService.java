package com.springframework.mypetclinic.Services.Map;

import java.util.Set;

import com.springframework.mypetclinic.Model.Visit;
import com.springframework.mypetclinic.Services.VisitService;

public class VisitMapService extends AbstractMapServices<Visit,Long> implements VisitService{

	
	@Override
	public Set<Visit> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Visit> findall() {
		// TODO Auto-generated method stub
		return super.findall();
	}

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return super.findById(id);
	}

	@Override
	public Visit save(Visit visit) {
		if(visit.getPet() == null || visit.getPet().getOwner()==null || visit.getPet().getId() == null
				||visit.getPet().getOwner().getId() == null) {
			throw new RuntimeException("Invalid Visit");
		}
		return super.save(visit);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		super.deleteById(id);
	}

	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
		super.delete(object);
	}
	
	

}
