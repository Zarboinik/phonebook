package foo.bar.service;

import foo.bar.dao.UserDao;
import foo.bar.model.User;

import java.util.List;


public class UserServiceImpl implements UserService {
   private UserDao userDao;

    public List<User> listUser() {
        return this.userDao.userList();
    }
}
