package guru.springframework.model;

public class PetType extends BaseEntity{
	/** added name **/
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
