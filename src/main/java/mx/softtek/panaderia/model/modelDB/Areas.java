package mx.softtek.panaderia.model.modelDB;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="AREAS")
@Embeddable
public class Areas implements Serializable{


	private static final long serialVersionUID = 6084355537692823650L;

	@NotNull
	@Id
	@Column(name ="area_id")
	private int areaId;
	
	@NotNull
	@Column(name ="nombre_area")
	private String nombreArea;
	
	@OneToOne(mappedBy = "area", cascade = CascadeType.ALL)
	private Usuarios usuario;
	
}
