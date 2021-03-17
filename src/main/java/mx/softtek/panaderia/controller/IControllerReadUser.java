package mx.softtek.panaderia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;



@RequestMapping("/Read")
public interface IControllerReadUser {
	
	@ApiOperation(value = "Lee un usuario", 
		      notes = "lectura de un usuario",
		      response = ResponseEntity.class,
		      httpMethod = "GET", 
		      authorizations = {@Authorization(value = "apiKey")})
	@GetMapping("/all")
	 ResponseEntity<?> readUser( );
}
