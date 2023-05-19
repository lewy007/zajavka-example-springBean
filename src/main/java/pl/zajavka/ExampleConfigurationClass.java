package pl.zajavka;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = Marker.class)
public class ExampleConfigurationClass {

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public InjectedBean injectedBean() {
        return new InjectedBean();
    }
}
