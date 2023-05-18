# zajavka-example-springBean
### Najpierw spring wywo³uje new ClassPathXmlApplicationContext(applicationContext.xml), nastepnie tworzy wstrzykiwane obiekty do konstruktura ExampleBean a nastêpnie jest wywo³ywana metoda z tej¿e klasy ");
### zamiast pliku xml - klasa ExampleConfigurationClass s³u¿y do tworzenia beanów zamiast pliku xml

```java
public class Main{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    // zamiast xml u¿ywamy annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
    }
}
```
