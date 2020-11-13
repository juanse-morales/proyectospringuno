package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		
		// Cargar el XML de configuración
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// Obtención del Bean
		Empleados sara = contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(sara.getInforme());
		
		// Cerrar el contexto
		contexto.close();

	}

}
