package guru.springframework.sfgpetclinic.model;

import java.util.Set;


public class Owner extends Person{
	
	private String  adress;
	private String  city ;
	private String  telephone;
	
	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

}
