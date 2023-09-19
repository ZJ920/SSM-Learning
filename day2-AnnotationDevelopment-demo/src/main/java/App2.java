import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import sdwz.zj.config.SpringConfig;
import sdwz.zj.domain.Account;
import sdwz.zj.service.AccountService;
import sdwz.zj.service.impl.AccountServiceImpl;

import java.util.List;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        AccountService accountService = ctx.getBean(AccountService.class);

        Account ac = accountService.findById(1);
        System.out.println(ac);

        List<Account> users = accountService.findAll();
        System.out.println(users);

    }
}
