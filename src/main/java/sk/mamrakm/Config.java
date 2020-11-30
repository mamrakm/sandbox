package sk.mamrakm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public Force forceUser1() {
        return new Jedi();
    }

    @Bean
    public ForceSensitive forceSensitive() {
        return new ForceSensitive(forceUser1());
    }
}
