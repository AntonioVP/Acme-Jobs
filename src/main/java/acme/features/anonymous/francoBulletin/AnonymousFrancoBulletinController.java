
package acme.features.anonymous.francoBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.francoBulletins.FrancoBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/franco-bulletin/")
public class AnonymousFrancoBulletinController extends AbstractController<Anonymous, FrancoBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousFrancoBulletinListService		listService;

	@Autowired
	private AnonymousFrancoBulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
