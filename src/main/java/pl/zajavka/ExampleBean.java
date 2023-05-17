package pl.zajavka;

public class ExampleBean {

    private final InjectedBean injectedBean;
    private AnotherInjectedBean anotherInjectedBean;

    public ExampleBean(InjectedBean injectedBean) {
        this.injectedBean = injectedBean;
        System.out.println("Calling ExampleBean()");
    }

    public void setAnotherInjectedBean(AnotherInjectedBean anotherInjectedBean) {
        this.anotherInjectedBean = anotherInjectedBean;
        System.out.println("Calling setAnotherInjectedBean()");
    }

    public void exampleMethod(){
        System.out.println("Calling exampleMethod");
    }
}
