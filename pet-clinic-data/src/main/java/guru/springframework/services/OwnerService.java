package guru.springframework.services;

import java.util.Set;

import guru.springframework.model.Owner;

public interface OwnerService {
	Owner findById(Long id);
	Owner findBylastname(String name);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
