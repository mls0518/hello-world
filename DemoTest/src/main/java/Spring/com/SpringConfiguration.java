package Spring.com;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

//标志该类是spring的核心配置类
@Configuration()
//开启注解扫描
@ComponentScan("Spring.com")
public class SpringConfiguration {

    @Bean
    public DataSource getDataSource() throws Exception{
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306");
        dataSource.getConnection();
        return dataSource;
    }

}
