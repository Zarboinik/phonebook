package foo.bar.dao;

import foo.bar.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    private SessionFactory sessionFactory;

    public List<User> userList() {
       Session session = this.sessionFactory.getCurrentSession();
       List<User> userList = session.createQuery("from User").list();
        return userList;
    }
}
