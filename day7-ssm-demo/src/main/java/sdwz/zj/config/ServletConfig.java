package sdwz.zj.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

//web容器配置类，从这里启动
public class ServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    /*这里面加载了两个容器
    ServletConfig可以以访问RootConfig，反之不行
    */

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    //加载配置类
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMVCConfig.class};
    }

    //过滤器
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
