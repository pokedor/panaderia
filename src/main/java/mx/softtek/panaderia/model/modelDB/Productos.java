package mx.softtek.panaderia.model.modelDB;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name ="PRODUCTOS")
public class Productos implements Serializable {

	private static final long serialVersionUID = 5203668153170501182L;
	
	
	@Id
	@Column(name = "producto_id")
	private int productId;
	
	
	@Column(name = "tipo_producto")
	private String tipoProducto;
	
	@Column(name = "nombre_producto")
	private String nombreProducto;
	
	@Column(name = "stock")
	private int stock;
	
	@ManyToMany(mappedBy = "producto")
	private List<Sucursales> sucursales;

}
