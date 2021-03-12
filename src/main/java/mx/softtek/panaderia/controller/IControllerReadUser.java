package mx.softtek.panaderia.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import mx.softtek.panaderia.model.UserBean;

public interface IControllerReadUser {
	
	
	
	
	ResponseEntity<?> createUser(@RequestBody @Valid UserBean user );
}
