package Spring.anno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component("target")
public class Target implements TargetInterface {
    @Override
    public void save() {
        System.out.println("save runing...");
    }
}
