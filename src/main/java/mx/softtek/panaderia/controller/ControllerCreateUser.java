package mx.softtek.panaderia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.softtek.panaderia.model.UserBean;
import mx.softtek.panaderia.service.CreateService;

@RestController
@RequestMapping("/bread-crumbles")
public class ControllerCreateUser implements IControllerCreateUser{
	
	
	@Autowired
	CreateService create;

	@Override
	public ResponseEntity<?> createUser(@Valid UserBean user) {
		
		
		
		return null;
	}



}
