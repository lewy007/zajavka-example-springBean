package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        System.out.println("Context created.");
        InjectedBean injectedBean = context.getBean("injectedBean", InjectedBean.class);
        injectedBean.someMethod();
        //Arrays.asList(context.getBeanDefinitionNames()).forEach(name-> System.out.println());
    }
}