package mx.softtek.panaderia.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@RequestMapping("/Read")
public interface IControllerReadUser {
	
	@GetMapping("/all")
	 ResponseEntity<?> createUser( );
}
