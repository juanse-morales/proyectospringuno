package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {

	private String email;
	private String nombreEmpresa;
	
	// Creaci�n de campo tipo Creaci�nInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	// 2. Creaci�n del constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		return "Informe creado por el Director: " + this.informeNuevo.getInforme();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	
	// Ejecutar tareas antes de que el Bean est� disponible
	
	public void init() {
		System.out.println("Init.");
	}
	
	
	// Ejecutar tareas despu�s que el bean haya sido utilizado

	public void destroy() {
		System.out.println("Destroy");
	}
}
