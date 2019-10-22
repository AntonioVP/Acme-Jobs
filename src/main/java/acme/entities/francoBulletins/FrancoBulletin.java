
package acme.entities.francoBulletins;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class FrancoBulletin extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				author;

	@NotBlank
	private String				text;

	@NotBlank
	private String				summary;

	@Temporal(TemporalType.TIMESTAMP)
	@Past
	private Date				fecha;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
