package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		
		/*
		//  Creación de objetos de tipo Empleado
		
		Empleados Empleado1 = new DirectorEmpleado();
		
		// Uso de los objetos creados
		
		System.out.println(Empleado1.getTareas());
		*/
		
		// 1. Crear el contexto: Cargar el archivo XML
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 2. Pedir el Bean
		SecretarioEmpleado juan = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado sara = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		DirectorEmpleado jorge = contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		// 3. Utilizar el Bean
		System.out.println(juan.getTareas());
		System.out.println(juan.getInforme());
		System.out.println("Email: " + juan.getEmail());
		System.out.println("Nombre de la Empresa: " + juan.getNombreEmpresa());
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println(sara.getTareas());
		System.out.println(sara.getInforme());
		System.out.println("Email: " + sara.getEmail());
		System.out.println("Nombre de la Empresa: " + sara.getNombreEmpresa());
		
		System.out.println("-------------------------------------------------------");
		
		System.out.println(jorge.getTareas());
		System.out.println(jorge.getInforme());
		System.out.println("Email: " + jorge.getEmail());
		System.out.println("Nombre de la Empresa: " + jorge.getNombreEmpresa());
		
		// Cerrar el XML
		contexto.close();
	}

}
