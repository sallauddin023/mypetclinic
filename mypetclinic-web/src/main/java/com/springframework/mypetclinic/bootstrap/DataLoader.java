package com.springframework.mypetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.mypetclinic.Model.Owner;
import com.springframework.mypetclinic.Model.Pet;
import com.springframework.mypetclinic.Model.PetType;
import com.springframework.mypetclinic.Model.Vet;
import com.springframework.mypetclinic.Services.OwnerService;
import com.springframework.mypetclinic.Services.PetTypeService;
import com.springframework.mypetclinic.Services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	
	

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		
		Owner owner1 = new Owner();
		owner1.setFirstName("Michel");
		owner1.setLastName("Wleston");
		owner1.setAddress("abc");
		owner1.setCity("Hyderabad");
		owner1.setTelephone("12154");
		ownerService.save(owner1);
		
		Pet mikesPet = new Pet();
		mikesPet.setPetType(savedDogPetType);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);
		Owner owner2 = new Owner();
		
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("abc");
		owner2.setCity("Hyderabad");
		owner2.setTelephone("12154");
		ownerService.save(owner2);
		Pet FionaCat = new Pet();
		FionaCat.setPetType(savedCatPetType);
		FionaCat.setOwner(owner2);
		FionaCat.setBirthDate(LocalDate.now());
		FionaCat.setName("Just Cat");
		owner2.getPets().add(FionaCat);
		
		System.out.println("Loaded Owners ......");
		
		
		Vet vet1 = new Vet();
	
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		
		vet2.setFirstName("Jessie");
		vet2.setLastName("porter");
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets ........");
		
	}
	

}
