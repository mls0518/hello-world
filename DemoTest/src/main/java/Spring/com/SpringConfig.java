package Spring.com;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("Spring.com")
@PropertySource("jdbc.properties")
public class SpringConfig {

}
