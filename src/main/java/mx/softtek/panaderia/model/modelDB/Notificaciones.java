package mx.softtek.panaderia.model.modelDB;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;
import mx.softtek.panaderia.util.ConstantExpressions;

@Getter
@Setter
@Entity
@Table(name="NOTIFICACIONES")
public class Notificaciones implements Serializable{

	private static final long serialVersionUID = -7388799549709307261L;

	@Id
	@Column(name ="notificacion_id")
	private String notificacionId;
	
	@Pattern(regexp=ConstantExpressions.PATTERN_MAIL)
	@Column(name ="correo_remitente")
	private String CorreoRemitente;
	

	@Pattern(regexp=ConstantExpressions.PATTERN_MAIL)
	@Column(name ="correo_destinatario")
	private String CorreoDestinatario;
	

	@Column(name ="mensaje")
	private String Mensaje;
	

	@Column(name ="tipo_mensaje")
	private String tipoMensaje;
	
	@ManyToMany(mappedBy = "notificacion")
	private List<Usuarios> usuarios;
}
