package Spring.demo;

import Spring.com.server.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoTest2 {

    @Test
    public void test1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest2.xml");
        UserServiceImpl bean = (UserServiceImpl) context.getBean("userServiceImpl");
        bean.demo1();
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest2.xml");
        UserServiceImpl bean = (UserServiceImpl) context.getBean("userService");
        bean.demo1();
    }
}
