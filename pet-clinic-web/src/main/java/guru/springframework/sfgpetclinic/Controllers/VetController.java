package guru.springframework.sfgpetclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgpetclinic.services.VetService;

@RequestMapping("/vets")
@Controller
public class VetController {
	
private final VetService vetService;
    
    public VetController (VetService vetService) {
        this.vetService = vetService;
    }
	
	
//	@RequestMapping({"/vets","/vets/index","/vets/index.html"})
//	public String listVets() {
//		return "vets/index";
//	}
	
	
    @RequestMapping({"","/","/index","/index.html"})
    public String listVets(Model model) {
        model.addAttribute("vets" , vetService.findAll());
        return "vets/index";
    }

}
