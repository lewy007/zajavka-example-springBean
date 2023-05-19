package pl.zajavka;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("### BEFORE CONTEXT ###");
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
        System.out.println("### AFTER CONTEXT ###");

        System.out.println("Context created.");

        System.out.println("### BEFORE BEAN RETRIEVAL ###");
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        InjectedBean injectedBean = context.getBean("injectedBean", InjectedBean.class);
        System.out.println("### AFTER BEAN RETRIEVAL ###");

        System.out.println("### BEFORE CALLING METHOD ###");
        exampleBean.exampleMethod();
        injectedBean.someMethod();
        System.out.println("### AFTER CALLING METHOD ###");

        System.out.println("### BEFORE CLOSING CONTEXT ###");
        context.close();
        System.out.println("### AFTER CLOSING CONTEXT ###");
//        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}