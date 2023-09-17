package sdwz.zj.service.impl;

import sdwz.zj.dao.Dao;
import sdwz.zj.service.BookService;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

public class BookServiceImpl implements BookService {

    private Dao daoBookService;
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
        this.id = id;
    }


    public void setDaoBookService(Dao BookService) {
        this.daoBookService = BookService;
    }

    @Override
    public void save() {
        System.out.println("DaoImpl save....");
        System.out.print("(经过BookService):");
        System.out.println("name:"+name+";id:"+id);
        daoBookService.save();
    }

}
