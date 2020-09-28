package com.springframework.mypetclinic.Services.Map;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.springframework.mypetclinic.Model.Vet;
import com.springframework.mypetclinic.Services.VetService;

@Service
public class VetServiceMap extends AbstractMapServices<Vet,Long> implements VetService {
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
        return super.save(object.getId(),object);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}
