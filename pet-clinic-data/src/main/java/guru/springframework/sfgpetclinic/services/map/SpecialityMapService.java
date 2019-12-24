package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.model.Speciality;
import guru.springframework.sfgpetclinic.services.SpecialitiesService;

public class SpecialityMapService  extends AbstractmapService<Speciality,Long> implements SpecialitiesService {

	
	public Set<Speciality> findAll(){
		
		return super.findAll();
	}
	
	public Speciality findById(Long id) {
		return super.findById(id);
	}
	
	public Speciality save( Speciality object)
            {
		return super.save(object)  ;      }
	
	public void deleteById(Long id){
		 super.deleteById(id);
	}
	
	public void delete(Speciality object) {
		super.delete(object);;
	}

}
