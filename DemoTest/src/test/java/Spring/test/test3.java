package Spring.test;

import Spring.com.SpringConfig;
import Spring.com.entity.Test1;
import Spring.com.entity.User;
import Spring.com.server.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.jws.soap.SOAPBinding;
import javax.swing.*;

public class test3 {




    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserServiceImpl bean = context.getBean(UserServiceImpl.class);
        UserServiceImpl bean1 = context.getBean(UserServiceImpl.class);
        System.out.println(bean);
        System.out.println(bean1);
        //bean.demo1();
    }

    @Test
    public void demo2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl bean = (UserServiceImpl)context.getBean("userServiceImpl");
        bean.demo1();
    }

    @Test
    public void test3(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserServiceImpl bean = context.getBean(UserServiceImpl.class);
        bean.demo1();
    }




}
