
package acme.features.anonymous.gutierrezBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.gutierrezBulletins.GutierrezBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousGutierrezBulletinRepository extends AbstractRepository {

	@Query("select s from GutierrezBulletin s")
	Collection<GutierrezBulletin> findMany();
}
