package com.springframework.mypetclinic.Services;


import com.springframework.mypetclinic.Model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);


}
