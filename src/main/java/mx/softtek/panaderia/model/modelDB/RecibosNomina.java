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
@Table(name ="RECIBOS_NOMINA")
public class RecibosNomina implements Serializable {
	

	private static final long serialVersionUID = -9047218528286493922L;

	@Id
	@Column(name = "recibo_id")
	private int reciboId;
	
	@Column(name = "fecha_nomina")
	private Date fechaNomina;
	
	@ManyToOne
    @JoinColumn(name = "usuario_id_fk", nullable = false, updatable = false)
	private Usuarios usuarioIdFK;

}
