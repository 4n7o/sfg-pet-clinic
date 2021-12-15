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
@RequestMapping({ "/owners" })
@Controller
public class OwnerController {

	@RequestMapping({ "", "/", "/index", "/index/" })
	public String listOwners() {
		return "owners/index";
	}

}
