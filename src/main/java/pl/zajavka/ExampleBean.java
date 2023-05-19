package pl.zajavka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleBean {

    private InjectedBean injectedBean;
    private AnotherInjectedBean anotherInjectedBean;
    private BeanInterface beanInterface;

    public ExampleBean() {
        System.out.println("Calling ExampleBean()");
    }

    @Autowired
    public ExampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean, BeanInterface bean2) {
        this.injectedBean = injectedBean;
        this.anotherInjectedBean = anotherInjectedBean;
        this.beanInterface = bean2;
        System.out.println("Calling ExampleBean(...)");
    }

    public void exampleMethod() {
        System.out.println("Calling exampleMethod" + ", " + injectedBean + ", " + beanInterface);
    }
}
