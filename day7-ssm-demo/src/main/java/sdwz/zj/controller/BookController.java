package sdwz.zj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sdwz.zj.domain.Book;
import sdwz.zj.service.BookService;

import java.util.List;

//使用@RestController注解替换@Controller与@ResponseBody注解，简化书写
//@RestController
@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    @ResponseBody
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        int code = flag ? Code.SAVE_OK : Code.SAVE_ERR;
        System.out.println("controller.save-"+code+":"+book);
        return new Result(code,flag);
    }

    @PutMapping
    @ResponseBody
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        int code = flag ? Code.UPDATE_OK : Code.UPDATE_ERR;
        System.out.println("controller.update-"+code+":"+book);
        return new Result(code,flag);
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        int code = flag ? Code.DELETE_OK : Code.DELETE_ERR;
        System.out.println("controller.delete-"+code+":"+id);
        return new Result(code,flag);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        int code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "查询失败，请重试！";
        System.out.println("controller.getById-"+code+":"+id);
        return new Result(code,book,msg);
    }

    @GetMapping
    @ResponseBody
    public Result getAll() {
        System.out.println("controller.getAll:");
        List<Book> bookList = bookService.getAll();
        int code = bookList != null ? Code.GET_OK : Code.GET_ERR;
        String msg = bookList != null ? "" : "查询失败，请重试！";
        System.out.println("controller.getById-"+code+":");
        return new Result(code,bookList,msg);
    }
}
