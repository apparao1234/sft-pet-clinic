package guru.springframework.services.map;

import java.util.Set;

import guru.springframework.model.Pet;
import guru.springframework.services.CrudService;

public class PetServiceMap  extends AbstractmapService<Pet,Long> implements CrudService<Pet,Long> {
	
	public Set<Pet> findAll(){
		
		return super.findAll();
	}
	
	public Pet findById(Long id) {
		return super.findById(id);
	}
	
	public Pet save( Pet object)
            {
		return super.save(object.getId(), object)  ;      }
	
	public void deleteById(Long id){
		 super.deleteById(id);
	}
	
	public void delete(Pet object) {
		super.delete(object);;
	}


}
