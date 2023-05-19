package pl.zajavka;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ExampleBean {

    private InjectedBean injectedBean;
    private AnotherInjectedBean anotherInjectedBean;
    private BeanInterface bean2;

    public ExampleBean() {
        System.out.println("Calling ExampleBean()");
    }

    public void exampleMethod() {
        System.out.println("Calling exampleMethod" + ", " + injectedBean + ", " + bean2);
    }
}
