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

### kolejnym etapem jest ³¹czenie adnotacji springowych z java. Wykorzystuj¹c adnotacjê CmponentScan wskazujemy (mo¿na wskazaæ paczkê lub interfejs który znajduje siê w danej paczce) gdzie spring ma wyszukiwaæ beanów (klas ozanczonych stereotypem Springowym, czyli adnotacjami typu Component, Service, Repository, Controller)
```java
@Configuration
@ComponentScan(basePackages = "pl.zajavka")
@ComponentScan(basePackageClasses = Marker.class)
public class ExampleConfigurationClass {
}
```

### Adnotacjami springowymi oznacza siê klasy które maj¹ s³u¿yæ do logiki biznesowej

### adnotacja autowired sluzy do automatycznego wiazania beanow przez springa, poniewaz mu wskazujemy ktore konstruktory ma wybierac.
```java
public class Main() {
    public ExampleBean() {
        System.out.println("Calling ExampleBean()");
    }

    @Autowired
    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling ExampleBean(...)");
    }
}
```
