package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		// 1. Carga de XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// Petición de bean al contenedor de Spring
		
		SecretarioEmpleado sara = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado andrea = contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(sara);
		System.out.println(andrea);
		
		if(sara == andrea) {
			System.out.println("Apunta al mismo objeto");
		}else {
			System.out.println("No se trata del mismo objeto");
		}
		
		contexto.close();
	}

}
