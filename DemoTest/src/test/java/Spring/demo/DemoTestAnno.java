package Spring.demo;

import Spring.anno.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beanTest3-anno.xml")
public class DemoTestAnno {

    @Autowired
    private TargetInterface target;

    @Test
    public void test1(){
        target.save();
    }

}
