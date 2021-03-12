package mx.softtek.panaderia.model;

public class EjemploBean {

	 private String telefono;
	    private String email;
	    private String numeroContactoEmergencia;
	    
	    
	    
	    
		public EjemploBean(String telefono, String email, String numeroContactoEmergencia) {
			super();
			this.telefono = telefono;
			this.email = email;
			this.numeroContactoEmergencia = numeroContactoEmergencia;
		}
		
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getNumeroContactoEmergencia() {
			return numeroContactoEmergencia;
		}
		public void setNumeroContactoEmergencia(String numeroContactoEmergencia) {
			this.numeroContactoEmergencia = numeroContactoEmergencia;
		}
    
	    
		
		
	    
}
