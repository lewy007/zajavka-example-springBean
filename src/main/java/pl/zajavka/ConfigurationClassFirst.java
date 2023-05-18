package pl.zajavka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClassFirst {

    @Bean
    public ExampleBean exampleBean(InjectedBean injectedBean, AnotherInjectedBean anotherInjectedBean) {
        return new ExampleBean(injectedBean, anotherInjectedBean);
    }
}
