/**
 * 
 */
package afavorito.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author A. Favorito on 15-12-2021
 *
 * 
 */
@Controller
public class VetController {
	@RequestMapping({ "/vets", "/vets/index", "/vets/index/" })
	public String listVets() {
		return "vets/index";
	}

}
