package sdwz.zj.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import sdwz.zj.exception.BusinessException;
import sdwz.zj.exception.SystemException;

//声明一个异常处理器
@RestControllerAdvice
public class ProtectExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public Result doException(Exception e){
        return new Result(Code.SYSTEM_UNKNOW_ERROR,null,"未知异常...");
    }

    @ExceptionHandler(SystemException.class)
    public Result doSystemException(SystemException e){
        return new Result(e.getCode(),null,e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public Result doBusinessException(BusinessException e){
        return new Result(e.getCode(),null,e.getMessage());
    }
}
