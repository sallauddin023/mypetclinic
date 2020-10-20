package com.springframework.mypetclinic.Model;

import java.util.HashSet;
import java.util.Set;

public class Vet extends Person {
	
	private Set<Speciality> speialities = new HashSet<>();

	public Set<Speciality> getSpeialities() {
		return speialities;
	}

	public void setSpeialities(Set<Speciality> speialities) {
		this.speialities = speialities;
	}
	
	
}
