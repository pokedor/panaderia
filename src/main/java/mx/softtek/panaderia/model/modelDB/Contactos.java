package mx.softtek.panaderia.model.modelDB;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@Entity
@Table(name = "CONTACTOS")
public class Contactos implements Serializable {

	private static final long serialVersionUID = 7805511519742669900L;
	
	@Id
	@Column(name = "contacto_id")
	private int contactoId;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "telefono_celular")
	private String telefonoCelular;
	
	@Column(name = "correo")
	private String correo;
	
	@OneToOne(mappedBy = "contacto", cascade = CascadeType.ALL)
	private Usuarios usuario;
	
	
}