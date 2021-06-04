package mx.softtek.panaderia.model;

import java.io.Serializable;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContactoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3692735442466934461L;

	@NotNull
	private String telefono;
	
	@NotNull
	private String telefonoCelular;
	
	@NotNull
	private String correo;
}
 