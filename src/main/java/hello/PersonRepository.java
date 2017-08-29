package hello;


import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonRepository {

    @Autowired
    private SessionFactory sessionFactory;

    public void saveUser(Person user) {
        sessionFactory.getCurrentSession().persist(user);
        sessionFactory.getCurrentSession().flush();
    }
}
