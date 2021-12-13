/**
 * 
 */
package afavorito.springframework.sfgpetclinic.model;

import java.time.LocalDate;

/**
 * @author A. Favorito on 09-12-2021
 *
 * 
 */
public class Pet extends BaseEntity {
	private PetType petType;
	private Owner ownwer;
	private LocalDate birthDate;

	public PetType getPetType() {
		return petType;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwnwer() {
		return ownwer;
	}

	public void setOwnwer(Owner ownwer) {
		this.ownwer = ownwer;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
