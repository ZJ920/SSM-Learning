package sdwz.zj.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class MyBatisConfig {

    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        /*mybatis-config的<typeAliases>标签：
            <typeAliases>
                <package name="sdwz.zj.domain"/>
            </typeAliases>
         这样，在BrandMapper中直接使用Brand:domain.Brand
             <resultMap id="brandResultMap" type="Brand">
         */
        sqlSessionFactoryBean.setTypeAliasesPackage("sdwz.zj.domain");
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    //接口mapper映射扫描
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setBasePackage("sdwz.zj.dao");

        return mapperScannerConfigurer;
    }
}
