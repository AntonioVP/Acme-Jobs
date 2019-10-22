
package acme.features.anonymous.gutierrezBulletin;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.gutierrezBulletins.GutierrezBulletin;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Anonymous;

@Controller
@RequestMapping("/anonymous/gutierrez-bulletin/")
public class AnonymousGutierrezBulletinController extends AbstractController<Anonymous, GutierrezBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	private AnonymousGutierrezBulletinListService	listService;

	@Autowired
	private AnonymousGutierrezBulletinCreateService	createService;


	// Constructors -----------------------------------------------------------

	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
	}
}
