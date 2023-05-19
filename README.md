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

### kolejnym etapem jest ��czenie adnotacji springowych z java. Wykorzystuj�c adnotacj� CmponentScan wskazujemy (mo�na wskaza� paczk� lub interfejs kt�ry znajduje si� w danej paczce) gdzie spring ma wyszukiwa� bean�w (klas ozanczonych stereotypem Springowym, czyli adnotacjami typu Component, Service, Repository, Controller)
```java
@Configuration
@ComponentScan(basePackages = "pl.zajavka")
@ComponentScan(basePackageClasses = Marker.class)
public class ExampleConfigurationClass {
}
```

### Adnotacjami springowymi oznacza si� klasy kt�re maj� s�u�y� do logiki biznesowej

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
