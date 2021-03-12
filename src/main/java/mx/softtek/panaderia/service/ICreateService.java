package mx.softtek.panaderia.service;

import mx.softtek.panaderia.model.ResponseBean;
import mx.softtek.panaderia.model.UserBean;

public interface ICreateService {
	
	ResponseBean createUser(UserBean user);

}
