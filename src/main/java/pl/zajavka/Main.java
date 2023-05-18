package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);

        System.out.println("Context created.");
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
        exampleBean.exampleMethod();
        //Arrays.asList(context.getBeanDefinitionNames()).forEach(name-> System.out.println());
    }
}