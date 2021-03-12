package mx.softtek.panaderia.exception.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Status implements Serializable {

	private static final long serialVersionUID = -4499250020643110811L;
	
	/** Atributo que contiene la informacion con respecto a statusCode */
	private String statusCode;

	/** Atributo que contiene la informacion con respecto a statusDesc */
	private String statusDesc;

	/** Atributo que contiene la informacion con respecto a additionalStatus */
	private AdditionalStatus additionalStatus;

	/** Atributo que contiene la informacion con respecto a severety */
	private String severity;
	
}