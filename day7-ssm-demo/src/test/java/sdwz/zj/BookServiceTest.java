package sdwz.zj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sdwz.zj.config.SpringConfig;
import sdwz.zj.domain.Book;
import sdwz.zj.service.BookService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;

    @Test
    public void GetByIdTest(){
        Book byId = bookService.getById(1);
        System.out.println(byId);
    }

    @Test
    public void GetAllTest(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
