/**
 * 
 */
package afavorito.springframework.sfgpetclinic.model;

/**
 * @author A. Favorito on 09-12-2021
 *
 * 
 */
public class Person extends BaseEntity {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
