package mx.softtek.panaderia.model.modelDB;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="USUARIOS")
public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1933774456872280683L;
	
	@Id
	@Column(name ="usuario_id")
	private int usuarioId;	

	@NotNull
	@Column(name ="nombre")
	private String nombre;
	
	@NotNull
	@Column(name ="apellido_p")
	private String apellidoP;
	
	@NotNull
	@Column(name ="apellido_m")
	private String apellidoM;
	
	@NotNull
	@Column(name ="sueldo")
	private String sueldo;
	
	@NotNull
	@Column(name ="contraseña")
	private String contraseña;
	
	@OneToOne
	@JoinColumn(name = "contacto_id_fk", updatable = false, nullable = false)
	private Contactos contacto;
	
	@OneToOne
	@JoinColumn(name = "area_id_fk", updatable = false, nullable = false)	
	private Areas area;
	
	@OneToOne
	@JoinColumn(name = "direccion_id_fk", updatable = false, nullable = false)
	private Direcciones direccion;
	
	@JoinTable(
	        name = "NOTIFICACIONES_USUARIOS",
	        joinColumns = @JoinColumn(name = "USUARIO_ID_FK", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="NOTIFICACION_ID_FK", nullable = false)
	    )
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Notificaciones> notificacion;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "usuarioIdFK")
	private List<RecibosNomina> recibos;
		
}
