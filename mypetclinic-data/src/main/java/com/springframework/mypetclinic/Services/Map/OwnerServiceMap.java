package com.springframework.mypetclinic.Services.Map;

import com.springframework.mypetclinic.Model.Owner;
import com.springframework.mypetclinic.Services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapServices<Owner,Long> implements CrudService<Owner,Long> {
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
}
