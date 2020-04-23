package ros.java.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ros.java.spring.entity.EntityOwner;
import ros.java.spring.service.ServiceOwner;

@Controller
@RequestMapping("/owner")
public class ControllerOwner {

	@Autowired
	private ServiceOwner serviceOwner;
	
	@RequestMapping("/list")
	public String ownerList(Model model) {
		
		List<EntityOwner> owners=serviceOwner.getOwners();
		model.addAttribute("owners", owners);
		
		return "owner-list";
	}
	
	@RequestMapping("/showAddOwnerForm")
	public String showAddOwnerForm(Model model) {
		
		EntityOwner owner=new EntityOwner();
		model.addAttribute("owner", owner);
		
		return "add-owner-form";
	}
	
	@PostMapping("/processAddOwnerForm")
	public String addOwner(@ModelAttribute("owner") EntityOwner owner) {
		
		if(owner.getOwnerPassword().equals(owner.getOwnerCheckPassword())) {
			serviceOwner.addOwner(owner);
			return "redirect:/owner/list";
		}else {
			return "redirect:/home";
		}
	}
	
	@RequestMapping("/showUpdateOwnerForm")
	public String showUpdateCustomerForm(@RequestParam("ownerId") int Id, Model model) {
		EntityOwner owner=serviceOwner.getOwner(Id);
		
		model.addAttribute("owner", owner);
		
		return "add-owner-form";
	}
	
	@RequestMapping("/delete")
	public String deleteOwner(@RequestParam("ownerId") int Id) {
	
		serviceOwner.deleteOwner(Id);
		
		return "redirect:/owner/list";
	}
	
}
