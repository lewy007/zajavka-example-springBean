package pl.zajavka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        System.out.println("Context created. Najpierw spring wywołuje new ClassPathXmlApplicationContext(applicationContext.xml); " +
                "nastepnie tworzy wstrzykiwane obiekty do konstruktura ExampleBean a następnie jest wywoływana metoda z tejże klasy ");
        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
       // exampleBean.exampleMethod();

    }
}