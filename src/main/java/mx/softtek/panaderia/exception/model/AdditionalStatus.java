package mx.softtek.panaderia.exception.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdditionalStatus implements Serializable {

	private static final long serialVersionUID = -2530819779601488029L;
	
	private String addStatusCode;
	
	private String addSeverity;
	
	private String addStatusDesc;

}
