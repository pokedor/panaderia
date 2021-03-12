package mx.softtek.panaderia.exception.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BakeryExceptionHandler {
	
	/** Constante de LOG de la clase */
	private static final Logger LOGGER = LoggerFactory.getLogger(BakeryExceptionHandler.class);
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<?> handleEntidadException(Exception e){
		LOGGER.error("ERROR GENERICO: {}", e.getMessage());
		//Status status = new Status("01","ERROR CONTROLLER",);
		return null;
	}

}