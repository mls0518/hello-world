package Spring.demo;

import Spring.com.entity.Test1;
import Spring.com.entity.User;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sound.midi.Soundbank;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.Arrays;
import java.util.ResourceBundle;

//基本案例，使用spring进行new实例
public class DemoTest1 {

    //简单user属性注入 xml文件
    @Test
    public void test1(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanTest1.xml");
        User bean = (User) context.getBean("user");
        System.out.println(bean);
        context.close();
    }

    //测试生成单例还是多例
    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest1.xml");
        User bean1 = (User) context.getBean("user");
        User bean2 = (User) context.getBean("user");
        System.out.println(bean1);
        System.out.println(bean2);
    }

    //测试构造器方式
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest1.xml");
        User user1 = (User) context.getBean("user1");
        System.out.println(user1);
    }

    //数组
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest1.xml");
        Test1 test1 = (Test1) context.getBean("str");
        test1.test1();
    }

    //list
    @Test
    public void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest1.xml");
        Test1 test1= (Test1) context.getBean("list");
        test1.test2();
    }

    //set
    @Test
    public void test6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest1.xml");
        Test1 set = (Test1) context.getBean("set");
        set.test3();
    }

    //map
    @Test
    public void test7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest1.xml");
        Test1 map = (Test1) context.getBean("map");
        map.test4();
    }

    //props
    @Test
    public void test8(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beanTest1.xml");
        Test1 prop = (Test1) context.getBean("prop");
        prop.test5();
    }

    //mysql连接池简单写法
    @Test
    public void test9() throws Exception{
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
    }

    //读取jdbc配置文件方式
    @Test
    public void test10() throws Exception{
        //读取jdbc文件
        ResourceBundle database = ResourceBundle.getBundle("jdbc");
        String username = database.getString("jdbc.username");
        String password = database.getString("jdbc.password");
        String url = database.getString("jdbc.url");
        String driver = database.getString("jdbc.driver");

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    //bean中xml配置文件方式
    @Test
    public void test11() throws Exception{
        ApplicationContext context =  new ClassPathXmlApplicationContext("beanTest1-1.xml");
        DataSource bean = (DataSource) context.getBean("dataSource");
        DruidDataSource dataSource = new DruidDataSource();
        Connection connection = bean.getConnection();
        System.out.println(connection);
    }
}
