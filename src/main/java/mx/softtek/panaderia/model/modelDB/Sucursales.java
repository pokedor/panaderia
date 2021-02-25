package mx.softtek.panaderia.model.modelDB;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="SUCURSALES")
public class Sucursales implements Serializable {

	private static final long serialVersionUID = 1444255078325693888L;
	
	@Id
	@Column(name="sucursal_id")
	private int sucursalId;
	
	@Column(name="nombre_sucursal")
	private String nombreSucursal;
	
	@OneToOne
	@JoinColumn(name = "sucursal_id_fk", updatable = false, nullable = false)
	private Direcciones direccionIdFK;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "sucursalIdFK")
	private List<Facturas> factura;
	
    @JoinTable(
            name = "productos_sucursales",
            joinColumns = @JoinColumn(name = "producto_id_fk", nullable = false),
            inverseJoinColumns = @JoinColumn(name="sucursal_id_fk", nullable = false)
        )
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Productos> producto;
	
}
