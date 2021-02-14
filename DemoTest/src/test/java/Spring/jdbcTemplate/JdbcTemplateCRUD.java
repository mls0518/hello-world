package Spring.jdbcTemplate;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUD {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void updateTest(){
        String sql = "update school.teacher set t_name = ? where t_id = ?;";
        int update = jdbcTemplate.update(sql, "张三风", "11");
        System.out.println(update);
    }

    @Test
    public void deleteTest(){
        String sql = "delete from school.teacher where t_id = ?;";
        int delete = jdbcTemplate.update(sql, "11");
        System.out.println(delete);
    }

    @Test
    public void selectTest(){
        String sql = "select * from school.teacher where t_id = ?;";
        Teacher teacher = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Teacher>(Teacher.class), "12");
        System.out.println(teacher);

    }

    @Test
    public void selectAllTest(){
        String sql = "select * from school.teacher;";
        List<Teacher> teacherList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Teacher>(Teacher.class));
        System.out.println(teacherList);
    }
}
