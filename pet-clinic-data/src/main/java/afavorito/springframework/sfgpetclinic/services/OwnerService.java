/**
 * 
 */
package afavorito.springframework.sfgpetclinic.services;

import java.util.Set;

import afavorito.springframework.sfgpetclinic.model.Owner;

/**
 * @author A. Favorito on 13-12-2021
 *
 * 
 */
public interface OwnerService {

	Owner findLastName(String lastName);

	Owner findById(Long id);

	Owner save(Owner owner);

	Set<Owner> findAll();

}
