package sdwz.zj.config;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
//翻译：组件扫描
@ComponentScan({"sdwz.zj.service"})
//翻译：属性来源
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MyBatisConfig.class})
//开启事务管理注解式驱动；翻译：启用事务管理
@EnableTransactionManagement
public class SpringConfig {
}
