import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
 
    @Bean(name="helloworld")
    @Scope("singleton")
    public HelloWorld getHelloWorld() {
        System.out.println("Create Bean helloworld!");
        return new HelloWorld();
    }

    @Bean(name="cat")
    @Scope("prototype")
    public Cat getCat() {
        System.out.println("Create Bean cat!");
        return new Cat();
    }
}