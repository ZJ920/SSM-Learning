package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import sdwz.zj.config.SpringConfig;
import sdwz.zj.domain.Account;
import sdwz.zj.service.AccountService;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class AccountServiceTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void findAllTest(){
        List<Account> all = accountService.findAll();
    }

    @Test
    public void findByIdTest(){
        Account byId = accountService.findById(1);
        System.out.println(byId);
    }
}
