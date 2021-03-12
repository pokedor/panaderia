package mx.softtek.panaderia.controller;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import mx.softtek.panaderia.model.UserBean;

public class ControllerReadUser implements IControllerReadUser {

	@Override
	public ResponseEntity<?> createUser(@Valid UserBean user) {
		// TODO Auto-generated method stub
		return null;
	}
  
}
