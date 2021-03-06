package guru.springframework.sfgpetclinic.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name="owners")
public class Owner extends Person{
	
	@Column(name="adress")
	private String  adress;
	@Column(name="city")
	private String  city ;
	@Column(name="telephone")
	private String  telephone;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="owner")
	private Set<Pet> pets = new HashSet<>();
	
	

}
