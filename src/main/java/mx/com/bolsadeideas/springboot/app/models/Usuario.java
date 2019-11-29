package mx.com.bolsadeideas.springboot.app.models;

public class Usuario {
	private String nonbre;
	private String apellido;

	public String getNonbre() {
		return nonbre;
	}

	public void setNonbre(String nonbre) {
		this.nonbre = nonbre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
}
