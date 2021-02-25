package mx.softtek.panaderia.exception.constants;

import lombok.Getter;

@Getter
public enum ErrorEnum {
	
	ERROR_CONTROLLER("01",ErrorEnum.LEVEL_ERROR,"ERROR EN CONTROLLER"),
	ERROR_SERVICE("02",ErrorEnum.LEVEL_ERROR,"ERROR EN SERVICE"),
	ERROR_REPOSITORY("03",ErrorEnum.LEVEL_ERROR,"ERROR EN REPOSITORY"); 
	
	
	
	/**	Constante del codigo estatus */
	private String statusCode;

	/**	constante codigo de severidad */
	private String severity;

	/**	 codigo status descripcion*/
	private String statusDesc;
	
    /** The Constant LEVEL_ERROR. */
    private static final String LEVEL_ERROR = "ERROR";

    /** La constante LEVEL_INFO. */
    private static final String LEVEL_INFO = "INFO";

    /** La constante LEVEL_WARN. */
    private static final String LEVEL_WARN = "WARN";

    /**Constante para el msg de success */
    private static final String SUCC="SUCCESS";
    
    /**
     * Método que inicia la construccion del objeto 
     * 
     * @param statusCode codigo de status
     * @param severity mensaje de severidad
     * @param statusDesc descripcion del status
     */
    ErrorEnum(String statusCode, String severity,String statusDesc){
    	this.statusCode = statusCode;
    	this.severity = severity;
    	this.statusDesc = statusDesc;
    }
	

}
