package sdwz.zj.factory;

import org.springframework.beans.factory.FactoryBean;
import sdwz.zj.service.impl.BookServiceImpl;

public class UserDaoFactory implements FactoryBean<BookServiceImpl> {
    @Override
    public BookServiceImpl getObject() throws Exception {
        return new BookServiceImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return BookServiceImpl.class;
    }
}
