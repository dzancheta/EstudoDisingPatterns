package pocMongo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by daniel on 09/08/17.
 */
@Configuration
public class AppConfig {

    @Bean
    public Teste teste(){
        return new Teste();
    }

}
