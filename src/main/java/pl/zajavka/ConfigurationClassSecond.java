package pl.zajavka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClassSecond {

    @Bean
    public InjectedBean injectedBean() {
        return new InjectedBean();
    }

    @Bean
    public AnotherInjectedBean anotherInjectedBean() {
        return new AnotherInjectedBean();
    }
}
