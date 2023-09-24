package sdwz.zj.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sdwz.zj.controller.Code;
import sdwz.zj.dao.BookDao;
import sdwz.zj.domain.Book;
import sdwz.zj.exception.BusinessException;
import sdwz.zj.exception.SystemException;
import sdwz.zj.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        try {
            return bookDao.save(book) >0;
        } catch (Exception e) {
            throw new BusinessException(Code.PROTECT_BUSINESS_ERROR,"业务异常：save保存异常...");
        }
    }

    @Override
    public boolean update(Book book) {
        try {
            return bookDao.update(book) >0;
        } catch (Exception e) {
            throw new BusinessException(Code.PROTECT_BUSINESS_ERROR,"业务异常：update更新异常...");
        }
    }

    @Override
    public boolean delete(Integer id) {
        try {
            return bookDao.delete(id) >0;
        } catch (Exception e) {
            throw new BusinessException(Code.PROTECT_BUSINESS_ERROR,"业务异常：delete删除异常...");
        }
    }

    @Override
    public Book getById(Integer id) {
        if (id <= 0){
            throw new BusinessException(Code.PROTECT_BUSINESS_ERROR,"业务异常：getById非法输入...");
        }
        try {
            //int i = 1/0;
            return bookDao.getById(id);//查询异常
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERROR,"业务响应超时...",e);
        }
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
