package sdwz.zj.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sdwz.zj.domain.Book;

import java.util.List;

@Transactional
public interface BookService {
    /*
    * 保存
    * */
    public boolean save(Book book);

    /*
    * 修改
    * */
    public boolean update(Book book);

    /*
     * 删除
     * */
    public boolean delete(Integer id);

    /*
     * 通过id查询
     * */
    public Book getById(Integer id);

    /*
     * 查询所有
     * */
    public List<Book> getAll();
}
