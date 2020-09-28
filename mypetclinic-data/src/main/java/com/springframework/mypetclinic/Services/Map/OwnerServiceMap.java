package com.springframework.mypetclinic.Services.Map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Owner;
import com.springframework.mypetclinic.Services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractMapServices<Owner,Long> implements OwnerService {
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
        return super.save(object.getId(),object);
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
