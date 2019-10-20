
package acme.entities.bulletins;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Bulletin extends DomainEntity {

	// Serialisation identifier -----------------------------------------------

	private static final long	serialVersionUID	= 1L;

	// Attributes -------------------------------------------------------------

	@NotBlank
	private String				name;

	@NotBlank
	private String				text;

	@NotBlank
	@Pattern(regexp = "Franco|Gutierrez|Lopez|Romero|Vidal")
	private String				type;

	// Derived attributes -----------------------------------------------------

	// Relationships ----------------------------------------------------------
}
