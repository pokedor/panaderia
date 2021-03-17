package mx.softtek.panaderia.model;

import java.io.Serializable;

import com.sun.istack.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SucursalBean implements Serializable {

	private static final long serialVersionUID = -628628468959806373L;
	
	@NotNull
	private String nombreSucursal;
	
	@NotNull
	private DireccionBean direccion;

}
