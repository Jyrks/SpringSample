package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    private PersonRepository repository;

    @RequestMapping("/")
    public String index() {
        repository.saveUser(new Person("Jack", "Bauer"));
        return "Hello World!";
    }
}
