package org.hugo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoComerciante {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Empleado hugo = context.getBean("comercianteExitoso", Empleado.class);

        System.out.println("tarea hugo: " + hugo.getTarea());
        System.out.println(hugo.getInforme());

        ComercianteExitoso pepo = context.getBean("comercianteExitoso", ComercianteExitoso.class);
        System.out.println("tarea pepo: "+ pepo.getTarea());
    }
}
