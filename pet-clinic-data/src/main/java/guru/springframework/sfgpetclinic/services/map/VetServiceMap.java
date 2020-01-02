
package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialitiesService;
import guru.springframework.sfgpetclinic.services.VetService;

@Service
@Profile({"default","map"})
public class VetServiceMap  extends AbstractmapService<Vet,Long> implements VetService {
	
     SpecialitiesService specialitiesService;
	
	public VetServiceMap(SpecialitiesService specialitiesService) {
	
		this.specialitiesService = specialitiesService;
	}
	
	public Set<Vet> findAll(){
		
		return super.findAll();
	}
	
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	public Vet save( Vet object) {
	
			if (object.getSpecialities().size() > 0) {
				object.getSpecialities().forEach(speciality ->{
					if(speciality.getId() ==null) {
						Speciality savedSpeciality = specialitiesService.save(speciality);
						speciality.setId(savedSpeciality.getId());
					}
					
				});
			}
		return super.save( object) ;
			
	}	
	
	
	public void deleteById(Long id){
		 super.deleteById(id);
	}
	
	public void delete(Vet object) {
		super.delete(object);;
	}


}

