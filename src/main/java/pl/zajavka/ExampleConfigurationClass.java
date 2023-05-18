package pl.zajavka;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ConfigurationClassFirst.class, ConfigurationClassSecond.class})
public class ExampleConfigurationClass {
}
