
package acme.features.anonymous.francoBulletin;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.francoBulletins.FrancoBulletin;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AnonymousFrancoBulletinRepository extends AbstractRepository {

	@Query("select s from FrancoBulletin s")
	Collection<FrancoBulletin> findMany();
}
