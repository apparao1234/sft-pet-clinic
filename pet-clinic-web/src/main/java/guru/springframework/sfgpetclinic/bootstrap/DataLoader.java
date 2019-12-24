package guru.springframework.sfgpetclinic.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.VetService;


@Component
public class DataLoader implements CommandLineRunner {
	
	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	public DataLoader(OwnerService ownerService,VetService vetService,PetTypeService petTypeService){
	//	ownerService = new OwnerServiceMap() ;
		// vetService = new VetServiceMap();
		
		this.vetService =vetService;
		this.ownerService = ownerService;
		this.petTypeService=petTypeService;
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
		PetType dog1 = new PetType();
		dog1.setName("Tammy");		
		PetType savedDogType = petTypeService.save(dog1);
		System.out.println(savedDogType);
		
		PetType cat = new PetType();
		cat.setName("Catty");		
		PetType savedCat = petTypeService.save(cat);
		
		System.out.println(savedCat);
		
		// TODO Auto-generated method stub
		Owner owner1 = new Owner();
		//owner1.setId(1L);
		owner1.setFirstName("Appar");
		owner1.setLastName("rao");
		owner1.setAdress("address1");
		owner1.setCity("Bengalore1");
		owner1.setTelephone("788888");
		ownerService.save(owner1);
		
		
		
		Pet mikespet = new Pet();
		mikespet.setPetType(savedDogType);
		mikespet.setOwner(owner1);
		mikespet.setBirthDate(LocalDate.now());
		mikespet.setName("Rosco");
		owner1.getPets().add(mikespet);
		
		Owner owner2 = new Owner();
		//owner2.setId(2L);
		owner2.setFirstName("Appar2");
		owner2.setLastName("rao2");
		owner2.setAdress("address2");
		owner2.setCity("Bengalore2");
		owner2.setTelephone("788888");
		ownerService.save(owner2);
		
		Pet mikespet1 = new Pet();
		mikespet1.setPetType(savedCat);
		mikespet1.setOwner(owner2);
		mikespet1.setBirthDate(LocalDate.now());
		mikespet1.setName("Rosco");
		owner2.getPets().add(mikespet1);
		
		
		
		System.out.println(owner2);
		
		Vet vet1 = new Vet();
		//vet1.setId(3L);
		vet1.setFirstName("Appar3");
		vet1.setLastName("rao3");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		//vet2.setId(4L);
		vet2.setFirstName("Appar4");
		vet2.setLastName("rao4");
		vetService.save(vet2);
		
		System.out.println(vet2);
		
		
		System.out.println("Loaded Vets .....");

	}

}
