/**
 * 
 */
package afavorito.springframework.sfgpetclinic.model;

import java.io.Serializable;

/**
 * @author A. Favorito on 13-12-2021
 *
 * 
 */
public class BaseEntity implements Serializable {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
