# zajavka-example-springBean
### Najpierw spring wywo�uje new ClassPathXmlApplicationContext(applicationContext.xml), nastepnie tworzy wstrzykiwane obiekty do konstruktura ExampleBean a nast�pnie jest wywo�ywana metoda z tej�e klasy ");
### zamiast pliku xml - klasa ExampleConfigurationClass s�u�y do tworzenia bean�w zamiast pliku xml

```java
public class Main{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    // zamiast xml u�ywamy annotation
        ApplicationContext context = new AnnotationConfigApplicationContext(ExampleConfigurationClass.class);
    }
}
```
