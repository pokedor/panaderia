package mx.softtek.panaderia.exception.model;

import java.io.Serializable;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
/**
 * comentario de prueba
 * @author yovae
 *
 */
@Getter
@Setter
public class Status implements Serializable {

	private static final long serialVersionUID = -4499250020643110811L;
	
	/** Atributo que contiene la informacion con respecto a statusCode */
	private String statusCode;

	/** Atributo que contiene la informacion con respecto a statusDesc */
	private String statusDesc;

	/** Atributo que contiene la informacion con respecto a additionalStatus */
	private List<AdditionalStatus> additionalStatus;

	/** Atributo que contiene la informacion con respecto a severety */
	private String severity; 
	
	
}
