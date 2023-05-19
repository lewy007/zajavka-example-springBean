package pl.zajavka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ExamplePrototypeBean {

    private InjectedBean injectedBean;

    @Autowired
    public ExamplePrototypeBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }

    public void exampleMethod() {
        System.out.println("START exampleMethod() in ExamplePrototypeBean ");
        injectedBean.someMethod();
        System.out.println("STOP exampleMethod() in ExamplePrototypeBean ");
    }

    public InjectedBean getInjectedBean() {
        return injectedBean;
    }
}
