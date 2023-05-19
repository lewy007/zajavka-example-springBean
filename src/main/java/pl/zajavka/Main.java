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

        System.out.println("### SCOPE ###");
        ExampleSingletonBean singleton1 = context.getBean(ExampleSingletonBean.class);
        ExampleSingletonBean singleton2 = context.getBean(ExampleSingletonBean.class);

        ExamplePrototypeBean prototype1 = context.getBean(ExamplePrototypeBean.class);
        ExamplePrototypeBean prototype2 = context.getBean(ExamplePrototypeBean.class);

        System.out.println("singleton1 == singleton2 ?" + (singleton1 == singleton2));
        System.out.println("prototype1 == prototype2 ?" + (prototype1 == prototype2));

        System.out.println("### BEFORE CLOSING CONTEXT ###");
        context.close();
        System.out.println("### AFTER CLOSING CONTEXT ###");
//        Arrays.asList(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}