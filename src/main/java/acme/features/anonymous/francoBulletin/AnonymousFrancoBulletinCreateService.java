
package acme.features.anonymous.francoBulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.francoBulletins.FrancoBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousFrancoBulletinCreateService implements AbstractCreateService<Anonymous, FrancoBulletin> {

	// Internal state ---------------------------------------------------------

	@Autowired
	AnonymousFrancoBulletinRepository repository;


	@Override
	public boolean authorise(final Request<FrancoBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<FrancoBulletin> request, final FrancoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);

	}

	@Override
	public void unbind(final Request<FrancoBulletin> request, final FrancoBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "text", "fecha", "summary");

	}

	@Override
	public FrancoBulletin instantiate(final Request<FrancoBulletin> request) {
		assert request != null;

		FrancoBulletin result = new FrancoBulletin();
		Date f = new Date(System.currentTimeMillis() - 1);

		result.setAuthor("Pepe Flores");
		result.setFecha(f);
		result.setSummary("This is a summary");
		result.setText("Bulletin text");

		return result;
	}

	@Override
	public void validate(final Request<FrancoBulletin> request, final FrancoBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<FrancoBulletin> request, final FrancoBulletin entity) {
		assert request != null;
		assert entity != null;

		this.repository.save(entity);

	}
}
