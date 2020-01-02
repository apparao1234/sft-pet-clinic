package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.services.VisitService;

@Service
@Profile({"default","map"})
public class VisitMapService  extends AbstractmapService<Visit,Long> implements VisitService {

	

	@Override
	public Visit save(Visit visit) {		
//		 System.out.println(visit.getPet().getId());
//		 System.out.println(visit.getPet().getOwner().getId());


			if(visit.getPet() == null  || visit.getPet().getOwner() == null || visit.getPet().getId() == null ||
					visit.getPet().getOwner().getId()==null  ) {

				throw new RuntimeException("Invalid Visit");			  }

			return super.save(visit);

		}

	
	
	public Set<Visit> findAll(){		
		return super.findAll();
	}
	
	public Visit findById(Long id) {
		return super.findById(id);
	}
	
	
	public void deleteById(Long id){
		 super.deleteById(id);
	}
	
	public void delete(Visit object) {
		super.delete(object);;
	}

}
