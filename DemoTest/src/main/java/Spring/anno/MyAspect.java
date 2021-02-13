package Spring.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    @Before("MyAspect.pointcut()")
    public void before(){
        System.out.println("前置增强。。。");
    }

    @AfterReturning("pointcut()")
    public void afterReturning(){
        System.out.println("后置增强。。。");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp)throws Throwable{
        System.out.println("环绕前增强。。。");
        Object proceed = pjp.proceed();
        System.out.println("环绕后增强。。。");
        return proceed;
    }

    @AfterThrowing("pointcut()")
    public void afterThrow(){
        System.out.println("异常抛出。。。");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("最终增强。。。");
    }

    @Pointcut("execution(* Spring.anno.*.*(..))")
    public void pointcut(){}
}
