package mx.softtek.panaderia.controller;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

import mx.softtek.panaderia.model.UserBean;

@Validated
@RequestMapping("/bread-crumbles")
public interface IControllerCreateUser {

	@ApiOperation(value = "Crea un nuevo usuario", 
			      notes = "creacion de un usuario",
			      response = ResponseEntity.class,
			      httpMethod = "POST", 
			      authorizations = {@Authorization(value = "apiKey")})
	@PutMapping(value="/create-user",produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<?> createUser(@RequestBody @Valid UserBean user );

}
