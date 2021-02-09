package Spring.test;

import Spring.com.entity.Test1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//集合

public class test2 {

    @Test
    public void demo1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Test1 myStrs = (Test1) context.getBean("myProps");
        myStrs.test1();
    }
}
