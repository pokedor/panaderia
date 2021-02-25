package mx.softtek.panaderia.model.modelDB;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "FACTURAS")

public class Facturas implements Serializable {

	private static final long serialVersionUID = 3411024673292849698L;
	
	@Id
	@Column(name ="factura_id")
	private int facturaId;
	
	@Column(name ="fecha_factura")
	private Date fechaFactura;
	
	@Column(name ="nombre_caliente")
	private String nombreCliente;
	
	@ManyToOne
	@JoinColumn(name = "sucursal_id_fk", nullable = false, updatable = false)
	private Sucursales sucursalIdFK;

}
