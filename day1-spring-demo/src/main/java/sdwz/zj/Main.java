package sdwz.zj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sdwz.zj.service.impl.BookServiceImpl;

public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = (BookServiceImpl) applicationContext.getBean("bookService");

        bookServiceImpl.save();
    }


}
