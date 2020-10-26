package com.springframework.mypetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springframework.mypetclinic.Model.Owner;
import com.springframework.mypetclinic.Model.Pet;
import com.springframework.mypetclinic.Model.PetType;
import com.springframework.mypetclinic.Model.Speciality;
import com.springframework.mypetclinic.Model.Vet;
import com.springframework.mypetclinic.Model.Visit;
import com.springframework.mypetclinic.Services.OwnerService;
import com.springframework.mypetclinic.Services.PetTypeService;
import com.springframework.mypetclinic.Services.SpecialityService;
import com.springframework.mypetclinic.Services.VetService;
import com.springframework.mypetclinic.Services.VisitService;
import com.springframework.mypetclinic.repositories.VetRepository;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	private final SpecialityService specialityService;
	private final VisitService visitService;
	
	
	

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService,
			SpecialityService specialityService, VisitService visitService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
		this.specialityService = specialityService;
		this.visitService = visitService;
		
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		loadData();
		
	}


	private void loadData() {
		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogPetType = petTypeService.save(dog);
		
		PetType cat = new PetType();
		dog.setName("Cat");
		PetType savedCatPetType = petTypeService.save(cat);
		
		Speciality radiology = new Speciality();
		radiology.setDescription("Radiology");
		
		Speciality surgery = new Speciality();
		surgery.setDescription("Surgery");
		
		Speciality dentistry = new Speciality();
		dentistry.setDescription("Dentistry");
		Speciality savedRadiology = specialityService.save(radiology);
		Speciality saveSurgery = specialityService.save(surgery);
		Speciality saveDentistry = specialityService.save(dentistry);
		
		
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
		Visit catVisit = new Visit();
		catVisit.setPet(FionaCat);
		catVisit.setDate(LocalDate.now());
		catVisit.setDescription("abcde");
		System.out.println("Loaded Owners ......");
		
		
		Vet vet1 = new Vet();
	
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");
		vet1.getSpeialities().add(savedRadiology);
		
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		
		vet2.setFirstName("Jessie");
		vet2.setLastName("porter");
		vet2.getSpeialities().add(saveSurgery);
		
		vetService.save(vet2);
		
		System.out.println("Loaded Vets ........");
	}
	

}
