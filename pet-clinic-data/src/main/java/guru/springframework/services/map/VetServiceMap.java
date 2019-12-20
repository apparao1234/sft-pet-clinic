
package guru.springframework.services.map;

import java.util.Set;

import guru.springframework.model.Vet;
import guru.springframework.services.CrudService;

 public class VetServiceMap  extends AbstractmapService<Vet,Long> implements CrudService<Vet,Long> {
	
	public Set<Vet> findAll(){
		
		return super.findAll();
	}
	
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	public Vet save( Vet object)
            {
		return super.save(object.getId(), object)  ;      }
	
	public void deleteById(Long id){
		 super.deleteById(id);
	}
	
	public void delete(Vet object) {
		super.delete(object);;
	}


}

