package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractmapService<Owner,Long> implements OwnerService {
	
	

	private final PetTypeService petTypeService;
	private final PetService petService;
	
	public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
	//	super();
		this.petTypeService = petTypeService;
		this.petService = petService;
	}
	
	
	public Set<Owner> findAll(){
		
		return super.findAll();
	}
	
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	
	
	public Owner save( Owner object)
            {
		if(object != null) {
			if (object.getPets() != null) {
				object.getPets().forEach(pet ->{
					if(pet.getPetType() !=null) {
						if( pet.getPetType().getId() !=null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					}else {
						throw new RuntimeException("Pet type is requried");
					}
					
					if(pet.getId()== null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
		return super.save( object)  ;    }
		else{
			return null;}
		}
	
	public void deleteById(Long id){
		 super.deleteById(id);
	}
	
	public void delete(Owner object) {
		super.delete(object);;
	}

	@Override
	public Owner findBylastname(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
