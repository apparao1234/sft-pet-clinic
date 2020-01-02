package guru.springframework.sfgpetclinic.services.springdatajpa;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import guru.springframework.sfgpetclinic.services.VisitService;

@Service
@Profile("springdatajpa")
public class VisitDSJpaService implements VisitService {
	
	private VisitRepository visitRepository;

	
	
	public VisitDSJpaService(VisitRepository visitRepository) {	
		this.visitRepository = visitRepository;
	}

	@Override
	public Set<Visit> findAll() {
		Set visits = new HashSet<>();		
		visitRepository.findAll().forEach(visits::add);
		return visits;
	}
	

	@Override
	public Visit findById(Long id) {
		// TODO Auto-generated method stub
		return visitRepository.findById(id).orElse(null);
	}

	@Override
	public Visit save(Visit object) {
		// TODO Auto-generated method stub
		return visitRepository.save(object);
	}

	@Override
	public void delete(Visit object) {
		// TODO Auto-generated method stub
		visitRepository.delete(object);
		
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		visitRepository.deleteById(id);
	}

}
