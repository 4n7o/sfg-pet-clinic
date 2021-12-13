/**
 * 
 */
package afavorito.springframework.sfgpetclinic.services;

import java.util.Set;

import afavorito.springframework.sfgpetclinic.model.Vet;

/**
 * @author A. Favorito on 13-12-2021
 *
 * 
 */
public interface VetService {

	Vet findById(Long id);

	Vet save(Vet vet);

	Set<Vet> findAll();
}
