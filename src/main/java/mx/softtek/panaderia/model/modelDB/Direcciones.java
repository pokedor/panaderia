package mx.softtek.panaderia.model.modelDB;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "DIRECCIONES")
public class Direcciones implements Serializable{

	private static final long serialVersionUID = 3986294658727442990L;

	@Id
	@Column(name = "direccion_id")
	private int direccionId;
	
	@Column(name = "calle")
	private	String calle;
	
	@Column(name = "numero_ext")
	private String numeroExt;
	
	@Column(name = "numero_int")
	private String numeroInt;
	
	@Column(name = "codigo_postal")
	private String codigoPostal;
	
	@Column(name = "colonia")
	private String colonia;
	
	@Column(name = "ciudad")
	private String ciudad;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "referencia")
	private String referencia;
	
	@OneToOne(mappedBy = "direccionIdFK", cascade = CascadeType.ALL)
	private Sucursales sucursal;
	
	@OneToOne(mappedBy = "direccion", cascade = CascadeType.ALL)
	private Usuarios usuario;
	
	
	
	
	
}
