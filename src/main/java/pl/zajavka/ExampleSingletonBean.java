package pl.zajavka;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ExampleSingletonBean {

    private InjectedBean injectedBean;

    public void exampleMethod() {
        System.out.println("START exampleMethod() in ExampleSingletonBean ");
        injectedBean.someMethod();
        System.out.println("STOP exampleMethod() in ExampleSingletonBean ");
    }

    public InjectedBean getInjectedBean() {
        return injectedBean;
    }
}
