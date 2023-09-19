package sdwz.zj.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* sdwz.zj.service.AccountService.*(..))")
    private void PointCut(){}

    //@Before("PointCut()")
    public void before(){
        System.out.println("向mybatis数据库执行了请求...");
    }

//    @Around("PointCut()")
//    public Object around(ProceedingJoinPoint pjp) throws Throwable {
//        Signature signature = pjp.getSignature();
//        String declaringTypeName = signature.getDeclaringTypeName();
//        String name = signature.getName();
//        long before = System.currentTimeMillis();
//        Object proceed=null;
//        for (int i = 0; i < 10000; i++) {
//            proceed = pjp.proceed();
//        }
//        long after = System.currentTimeMillis();
//        System.out.println(declaringTypeName+name+"向mybatis数据库执行请求所费时间:"+(after-before));
//        return proceed;
//    }

    @Around("PointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        Object[] args = pjp.getArgs();
        if (args.length>0){
            args[0] = (Integer)args[0] +1;
        }
        Signature signature = pjp.getSignature();
        String declaringTypeName = signature.getDeclaringTypeName();
        String name = signature.getName();
        Object proceed= proceed = pjp.proceed(args);
        return proceed;
    }
}
