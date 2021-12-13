/**
 * 
 */
package afavorito.springframework.sfgpetclinic.services;

import java.util.Set;

import afavorito.springframework.sfgpetclinic.model.Pet;

/**
 * @author A. Favorito on 13-12-2021
 *
 * 
 */
public interface PetService {

	Pet findById(Long id);

	Pet save(Pet pet);

	Set<Pet> findAll();

}
