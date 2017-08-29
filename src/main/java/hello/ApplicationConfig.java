package hello;

import org.hibernate.SessionFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import javax.sql.DataSource;

@ConfigurationProperties
public class ApplicationConfig {

    @Bean(name="sessionFactory")
    public SessionFactory registerSessionFactory(DataSource dataSource) {
        return new LocalSessionFactoryBuilder(dataSource).scanPackages("hello").buildSessionFactory();
    }
}
