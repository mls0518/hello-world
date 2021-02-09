package Spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import javax.sql.DataSource;
import java.sql.Connection;
import java.util.ResourceBundle;

public class DataSourceTest {

    @Test
    public void test1() throws Exception{
        DruidDataSource source = new DruidDataSource();
        source.setDriverClassName("com.mysql.jdbc.Driver");
        source.setUrl("jdbc:mysql://localhost:3306/test");
        source.setUsername("root");
        source.setPassword("123456");
        DruidPooledConnection connection = source.getConnection();
        System.out.println(connection);
        connection.close();
    }


    @Test
    public void test2() throws Exception{
        ResourceBundle rb = ResourceBundle.getBundle("jdbc");
        String username = rb.getString("jdbc.username");
        String password = rb.getString("jdbc.password");
        String url = rb.getString("jdbc.url");
        String driver = rb.getString("jdbc.driver");
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driver);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }

    @Test
    public void test3() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        DataSource bean = context.getBean(DataSource.class);
        DruidDataSource dataSource = new DruidDataSource();

        Connection connection = bean.getConnection();
        System.out.println(connection);
    }



}
