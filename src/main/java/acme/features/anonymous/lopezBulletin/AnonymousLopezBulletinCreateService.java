
package acme.features.anonymous.lopezBulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.lopezBulletins.LopezBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service

public class AnonymousLopezBulletinCreateService implements AbstractCreateService<Anonymous, LopezBulletin> {

	@Autowired
	AnonymousLopezBulletinRepository repository;


	@Override
	public boolean authorise(final Request<LopezBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public LopezBulletin instantiate(final Request<LopezBulletin> request) {
		assert request != null;
		LopezBulletin result;

		Date moment;
		moment = new Date(System.currentTimeMillis() - 1);

		result = new LopezBulletin();
		result.setName("Thibaut");
		result.setText("Hello there form Seville");
		result.setLocation("Seville");
		result.setMoment(moment);
		return result;
	}

	@Override
	public void bind(final Request<LopezBulletin> request, final LopezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<LopezBulletin> request, final LopezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "text", "location", "moment");

	}

	@Override
	public void validate(final Request<LopezBulletin> request, final LopezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<LopezBulletin> request, final LopezBulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		entity.setMoment(moment);
		this.repository.save(entity);
	}
}
