package Spring.demo;

import Spring.aop.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beanTest3-aop.xml")
public class DemoTestAop {

    @Autowired
    private TargetInterface target;

    @Test
    public void test1(){
        target.save();
    }

}
