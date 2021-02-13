package Spring.demo;

import Spring.com.server.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beanTest2.xml")
public class SpringJunitTest {

    @Resource
    private UserServiceImpl userServiceimpl;

    @Test
    public void test1(){
        userServiceimpl.demo1();
    }

}
