/**
 * 
 */
package afavorito.springframework.sfgpetclinic.services;

import afavorito.springframework.sfgpetclinic.model.Owner;

/**
 * @author A. Favorito on 13-12-2021
 *
 * 
 */
public interface OwnerService extends CrudService<Owner, Long> {

	Owner findLastName(String lastName);



}
