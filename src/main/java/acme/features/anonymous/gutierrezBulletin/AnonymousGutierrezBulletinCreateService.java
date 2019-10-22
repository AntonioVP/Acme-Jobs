
package acme.features.anonymous.gutierrezBulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.gutierrezBulletins.GutierrezBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousGutierrezBulletinCreateService implements AbstractCreateService<Anonymous, GutierrezBulletin> {

	@Autowired
	AnonymousGutierrezBulletinRepository repository;


	@Override
	public boolean authorise(final Request<GutierrezBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public GutierrezBulletin instantiate(final Request<GutierrezBulletin> request) {
		assert request != null;
		GutierrezBulletin result;

		Date moment;
		moment = new Date(System.currentTimeMillis() - 1);

		result = new GutierrezBulletin();
		result.setName("Carlos Zen");
		result.setText("Lorem Ipsum.");
		result.setNovel("The Saga of Tanya the Evil: Deus lo Vult");
		result.setOpinion("What's your current opinion about the novel?");
		result.setMoment(moment);
		return result;
	}

	@Override
	public void bind(final Request<GutierrezBulletin> request, final GutierrezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<GutierrezBulletin> request, final GutierrezBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "name", "text", "novel", "opinion", "moment");

	}

	@Override
	public void validate(final Request<GutierrezBulletin> request, final GutierrezBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<GutierrezBulletin> request, final GutierrezBulletin entity) {
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		entity.setMoment(moment);
		this.repository.save(entity);
	}

	// Internal state ---------------------------------------------------------

}
