package com.tangj.springboot.config;

import java.util.Properties;

import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;

import com.github.pagehelper.PageHelper;

/**
 * Created by kx on 17/4/2.
 */
public class MyBatisConfig {
	@Bean(name = "sqlSessionFactory")
	public SqlSessionFactory sqlSessionFactoryBean() {
		SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
		// bean.setDataSource(dataSource());

		bean.setTypeAliasesPackage("com.tangj.springboot.domain");

		// 分页插件设置
		PageHelper pageHelper = new PageHelper();
		Properties properties = new Properties();
		properties.setProperty("reasonable", "true");
		properties.setProperty("supportMethodsArguments", "true");
		properties.setProperty("returnPageInfo", "check");
		properties.setProperty("params", "count=countSql");
		pageHelper.setProperties(properties);

		// 添加分页插件
		bean.setPlugins(new Interceptor[] { pageHelper });

		try {
			// ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
			// 基于注解扫描Mapper，不需配置xml路径
			// bean.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
			return bean.getObject();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
}