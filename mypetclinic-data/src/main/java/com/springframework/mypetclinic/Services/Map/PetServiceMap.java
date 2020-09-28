package com.springframework.mypetclinic.Services.Map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Pet;
import com.springframework.mypetclinic.Services.PetService;

@Service
public class PetServiceMap extends AbstractMapServices<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findall();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
