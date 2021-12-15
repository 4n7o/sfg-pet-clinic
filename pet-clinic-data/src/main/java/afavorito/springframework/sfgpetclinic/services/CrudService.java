/**
 * 
 */
package afavorito.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * @author A. Favorito on 15-12-2021
 *
 * 
 */
public interface CrudService<T, ID> {
	Set<T> findAll();

	T findbyId();

	T save(T object);

	void delete(T object);

}
