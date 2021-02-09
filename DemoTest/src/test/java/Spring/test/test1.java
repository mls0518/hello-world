package Spring.test;

import Spring.com.entity.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.zip.CheckedOutputStream;

public class test1 {


    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User bean1 = context.getBean(User.class);
        User bean2 = context.getBean(User.class);
        System.out.println(bean1);
        System.out.println(bean2);
    }

    @Test
    public void demo2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User userCon = (User) context.getBean("userCon");
        userCon.test1();
    }

    @Test
    public void demo3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User p = (User) context.getBean("userP");
        System.out.println(p);
    }
}