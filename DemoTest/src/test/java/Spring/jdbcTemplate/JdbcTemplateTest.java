package Spring.jdbcTemplate;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

//测试jdbc
public class JdbcTemplateTest {


    @Test
    public void test2() throws Exception{
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        String sql = "insert into school.teacher values(?,?);";
        int i = jdbcTemplate.update(sql, "13", "列子");
        System.out.println(i);
    }

    //jdbc快速入门
    @Test
    public void test1() throws Exception{
        //使用druid创建数据库对象
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setUrl("jdbc:mysql://localhost:3306/school");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");

        //创建jdbc对象
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //设置数据源对象 知道数据库在哪
        jdbcTemplate.setDataSource(dataSource);
        String sql = "insert into school.teacher values(?,?);";
        int i = jdbcTemplate.update(sql, "11", "王了");
        System.out.println(i);
    }

}
