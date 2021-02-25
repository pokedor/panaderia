package mx.softtek.panaderia.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserBean {
	
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
