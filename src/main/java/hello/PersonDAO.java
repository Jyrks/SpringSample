package hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public void saveUser(Person user) {
        jdbcTemplate.update("insert into person (name, last_name) values (?, ?)", user.getName(), user.getLastName());
    }
}
