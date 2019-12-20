package guru.springframework.services.map;

import java.util.Set;

import guru.springframework.model.Owner;
import guru.springframework.services.CrudService;

public class OwnerServiceMap extends AbstractmapService<Owner,Long> implements CrudService<Owner,Long> {
	
	public Set<Owner> findAll(){
		
		return super.findAll();
	}
	
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	public Owner save( Owner object)
            {
		return super.save(object.getId(), object)  ;      }
	
	public void deleteById(Long id){
		 super.deleteById(id);
	}
	
	public void delete(Owner object) {
		super.delete(object);;
	}


}
