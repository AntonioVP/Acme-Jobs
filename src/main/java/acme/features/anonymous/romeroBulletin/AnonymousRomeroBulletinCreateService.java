
package acme.features.anonymous.romeroBulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.romeroBulletins.RomeroBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousRomeroBulletinCreateService implements AbstractCreateService<Anonymous, RomeroBulletin> {

	@Autowired
	AnonymousRomeroBulletinRepository repository;


	@Override
	public boolean authorise(final Request<RomeroBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public RomeroBulletin instantiate(final Request<RomeroBulletin> request) {
		assert request != null;
		RomeroBulletin result;

		Date moment;
		moment = new Date(System.currentTimeMillis() - 1);

		result = new RomeroBulletin();
		result.setName("Pablo");
		result.setText("lorem ipsum");
		result.setBibliography("I have already graduated");
		result.setMoment(moment);
		return result;
	}

	@Override
	public void bind(final Request<RomeroBulletin> request, final RomeroBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<RomeroBulletin> request, final RomeroBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "text", "bibliography", "moment");

	}

	@Override
	public void validate(final Request<RomeroBulletin> request, final RomeroBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<RomeroBulletin> request, final RomeroBulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		entity.setMoment(moment);
		this.repository.save(entity);
	}

	// Internal state ---------------------------------------------------------

}
