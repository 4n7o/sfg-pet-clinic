/**
 * 
 */
package afavorito.springframework.sfgpetclinic.services.map;

import java.util.Set;

import afavorito.springframework.sfgpetclinic.model.Pet;
import afavorito.springframework.sfgpetclinic.services.CrudService;

/**
 * @author A. Favorito on 15-12-2021
 *
 * 
 */
public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}

	@Override
	public Pet findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Pet save(Pet object) {
		return super.save(object.getId(), object);

	}

	@Override
	public void delete(Pet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
