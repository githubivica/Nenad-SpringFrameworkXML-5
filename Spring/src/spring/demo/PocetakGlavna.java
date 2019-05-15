package spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PocetakGlavna {

	public static void main(String[] args) {
		
		/*Profesor p = new ProfesorBiologije();
		System.out.println(p.getGreeting());*/
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Profesor p = context.getBean("mojProfesorG",Profesor.class);
		
		System.out.println(p.getGreeting());
		System.out.println(p.getOblastRada());
		
		context.close();


	}

}
