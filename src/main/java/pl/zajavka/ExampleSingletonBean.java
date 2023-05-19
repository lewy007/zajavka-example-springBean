package pl.zajavka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ExampleSingletonBean {

    private InjectedBean injectedBean;

    @Autowired
    public ExampleSingletonBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
    }

    public void exampleMethod() {
        System.out.println("START exampleMethod() in ExampleSingletonBean ");
        injectedBean.someMethod();
        System.out.println("STOP exampleMethod() in ExampleSingletonBean ");
    }

    public InjectedBean getInjectedBean() {
        return injectedBean;
    }
}
