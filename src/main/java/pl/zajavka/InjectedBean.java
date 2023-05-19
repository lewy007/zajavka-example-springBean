package pl.zajavka;

import org.springframework.stereotype.Service;

@Service
public class InjectedBean {
    public InjectedBean() {
        System.out.println("Calling InjectedBean()");
    }

    public void someMethod() {
        System.out.println("Calling InjectedBean#someMethod()");
    }

    public void initMethod() {
        System.out.println("Calling initMethod in ExampleBean");
    }

    public void destroyMethod() {
        System.out.println("Calling destroyMethod in ExampleBean");
    }
}
