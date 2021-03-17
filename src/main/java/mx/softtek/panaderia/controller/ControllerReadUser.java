package mx.softtek.panaderia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerReadUser implements IControllerReadUser {
 
/*** 
 * Metodo que manda a listar todos los usuarios
 * 
 * @return lista de todos los usuarios
 */
	@Override
	public ResponseEntity<?> readUser() {
		// TODO Auto-generated method stub
		return null;
	}
  
}
