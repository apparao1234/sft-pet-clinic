package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;

@Service
public class OwnerServiceMap extends AbstractmapService<Owner,Long> implements OwnerService {
	
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

	@Override
	public Owner findBylastname(String name) {
		// TODO Auto-generated method stub
		return null;
	}


}
