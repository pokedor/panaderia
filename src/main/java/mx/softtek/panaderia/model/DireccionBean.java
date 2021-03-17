package mx.softtek.panaderia.model;

import java.io.Serializable;


import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DireccionBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8758090488683871102L;

	@NotNull
	private	String calle;
	
	@NotNull
	private String numeroExt;
	
	@NotNull
	private String numeroInt;
	
	@NotNull
	private String codigoPostal;
	
	@NotNull
	private String colonia;
	
	@NotNull
	private String ciudad;
	
	@NotNull
	private String estado;
	
	@NotNull
	private String referencia;
}
