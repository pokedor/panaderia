package mx.softtek.panaderia.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6343334793802758954L;

	@NotNull
	private String nombre;

	@NotNull
	private String apellidoP;
	
	@NotNull
	private String apellidoM;
	
	@NotNull
	private double sueldo;
	
	@NotNull
	private String contraseña;
	
	@NotNull
	private int sucursal;
	
	@NotNull
	private ContactoBean contacto;
	
	@NotNull
	private int area;
	
	@NotNull
	private DireccionBean direccion;
	
	
	
}
