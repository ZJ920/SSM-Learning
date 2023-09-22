package sdwz.zj.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//声明一个异常处理器
@RestControllerAdvice
public class ProtectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        return new Result(444,null,"出现异常。。。");
    }
}
