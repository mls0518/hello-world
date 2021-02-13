package Spring.com.server;

import Spring.com.dao.UserDao;
import Spring.com.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("singleton")
public class UserServiceImpl {

    @Value("${jdbc.driver}")
    private String driver;

    @Autowired
    private UserDao userDao;

    public void demo1(){
        System.out.println(driver);
        System.out.println("userService....");
        userDao.save();
    }


    public void setUserDao(UserDaoImpl userDao) {
    }
}
