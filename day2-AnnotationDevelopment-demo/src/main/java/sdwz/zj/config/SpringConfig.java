package sdwz.zj.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("sdwz.zj")
//@PropertySource：加载类路径jdbc.properties文件
@PropertySource("classpath:jdbc.properties")
@Import({JdbcConfig.class,MybatisConfig.class})
//启用AspectJ支持：默认情况下，Spring使用动态代理实现AOP功能，而通过该注解，则会启用AspectJ编译器，并基于AspectJ框架生成代理对象。
@EnableAspectJAutoProxy
public class SpringConfig {
}
