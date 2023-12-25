package www.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"www.test.config","www.test.controller"})
@EnableWebMvc
public class SpringMvcConfig {
}
