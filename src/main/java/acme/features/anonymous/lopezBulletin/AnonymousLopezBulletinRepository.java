
package acme.features.anonymous.lopezBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.lopezBulletins.LopezBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousLopezBulletinRepository extends AbstractRepository {

	@Query("select s from LopezBulletin s")
	Collection<LopezBulletin> findMany();
}
